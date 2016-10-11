package com.michaelwilson.android.aca.notetoself;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DialogNewNote extends DialogFragment {


    private static final int CAMERA_REQUEST = 123;
    private ImageView mImageView;

    // The filepath for the photo
    String mCurrentPhotoPath;

    // Where the captured image is stored
    private Uri mImageUri = Uri.EMPTY;


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {

            Log.i("uri_test", mImageUri.toString());
            try {

                mImageView.setImageURI(Uri.parse(mImageUri.toString()));
            } catch (Exception e) {

                Log.e("Error", "Uri not set");
            }

        }else{
            mImageUri = Uri.EMPTY;

        }
    }

    private File createImageFile() throws IOException {
        // Create an image file name
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String imageFileName = "JPEG_" + timeStamp + "_";
        File storageDir = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES);
        File image = File.createTempFile(
                imageFileName,  // filename
                ".jpg",         // extension
                storageDir      // folder
        );

        // Save for use with ACTION_VIEW Intent
        mCurrentPhotoPath = "file:" + image.getAbsolutePath();

        return image;

    }



    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        // Declare and initialize an AlertDialog.Builder object
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        /*
        Initialize a LayoutInflater object, which we'll use to inflate our
        XML layout. (Turn our XML Layout into a Java Object.
        inflater.inflate basically replaces setContentView for our dialog
        Then we create and inflate a new View, which will then contain all the
        UI elements from our dialog_new_note.xml layout file.
        */
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_new_note, null);

        /*
        Here we get references to each of the UI widgets in our layout.  Many of
        the objects are declared final because they will be used in an anonymous
        class. This is required.
         */
        final EditText editTitle = (EditText) dialogView.findViewById(R.id.editTitle);
        final EditText editDescription = (EditText) dialogView.findViewById(R.id.editDescription);
        final CheckBox checkBoxIdea = (CheckBox) dialogView.findViewById(R.id.checkBoxIdea);
        final CheckBox checkBoxTodo = (CheckBox) dialogView.findViewById(R.id.checkBoxTodo);
        final CheckBox checkBoxImportant = (CheckBox) dialogView.findViewById(R.id.checkBoxImportant);
        Button btnCancel = (Button) dialogView.findViewById(R.id.btnCancel);
        Button btnOK = (Button) dialogView.findViewById(R.id.btnOK);
        Button btnCapture = (Button) dialogView.findViewById(R.id.btnCapture);
        mImageView = (ImageView)dialogView.findViewById(R.id.imageView2);


        // Listen for clicks on the capture button
        btnCapture.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                File photoFile = null;
                try {
                    photoFile = createImageFile();

                } catch (IOException e) {

                    // Error occured while creating the File
                    Log.e("error", "error creating file");
                }

                // Continue only if the File was successfully created
                if (photoFile != null) {
                    mImageUri = Uri.fromFile(photoFile);
                    cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(photoFile));
                    startActivityForResult(cameraIntent, CAMERA_REQUEST);
                }
            }




        });





        /*
        Now we set the message of the dialog using builder. Then we write an
        anonymous class to handle clicks on btnCancel. In the overridden onClick
        method, we simply call dismiss(), which is a public method of DialogFragment,
        to close the dialog window.
         */
        builder.setView(dialogView).setMessage("Add a new note");

        // Handle the cancel button
        btnCancel.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        /*
        Now we add an anonymous class to handle what happens when the user click on
        the OK button (btnOK)
         */
        // Handle the OK button
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create a new note
                Note newNote = new Note();

                // Set its variables to match the users entries on the form
                newNote.setTitle(editTitle.getText().toString());
                newNote.setDescription(editDescription.getText().toString());
                newNote.setIdea(checkBoxIdea.isChecked());
                newNote.setTodo(checkBoxTodo.isChecked());
                newNote.setImportant(checkBoxImportant.isChecked());
                newNote.setUri(mImageUri);

                // Get a reference to MainActivity
                MainActivity callingActivity = (MainActivity) getActivity();

                // Pass newNote back to MainActivity
                callingActivity.createNewNote(newNote);

                // Quit the dialog
                dismiss();
            }
        });

        return builder.create();
    }


}
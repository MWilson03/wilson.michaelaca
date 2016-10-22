package com.michaelwilson.android.aca.filmsearch;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MoviesApiService {

    @GET("/3/movie/popular?api_key=f810377eb67df1afdfce90ee5d9b627b")
    Call<Movie.MovieResult> getPopularMovies();

}
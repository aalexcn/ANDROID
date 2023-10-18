package com.example.login03102023.lst_films.model.entities;


import retrofit2.Call;
import retrofit2.http.GET;

public interface MoviesAPI {
    @GET("movie/popular?api_key=TU_API_KEY")
    Call<MovieResponse> getPopularMovies();
}


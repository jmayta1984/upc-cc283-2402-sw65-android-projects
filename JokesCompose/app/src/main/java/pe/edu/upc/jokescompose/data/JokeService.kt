package pe.edu.upc.jokescompose.data

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface JokeService {

    @Headers("Accept: application/json")
    @GET("/")
    suspend fun getRandomJoke(): Response<JokeDto>

}
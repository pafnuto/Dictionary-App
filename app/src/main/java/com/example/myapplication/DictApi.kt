package dictapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface DictApi {

    @GET("en/{word}")
    suspend fun getMeaning(@Path("word") word : String) : Response<List<WordResult>>

}
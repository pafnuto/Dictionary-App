package dictapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofit {

    private const val BASE_URL = "https://api.dictionaryapi.dev/api/v2/entries/"

    private fun getInstance() : Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val dictionaryApi : DictApi = getInstance().create(DictApi::class.java)


}
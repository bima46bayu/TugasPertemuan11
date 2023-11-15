package com.example.tugaspertemuan11.network


import com.example.tugaspertemuan11.model.ApiResponse
import retrofit2.Call
import retrofit2.http.GET

// Interface ini mendefinisikan endpoint-endpoint yang dapat diakses dari server menggunakan Retrofit
interface ApiService {
    // Annotation @GET("assets") menandakan bahwa metode ini akan melakukan permintaan GET ke endpoint "assets"
    // Metode ini akan mengembalikan objek Call yang berisi ApiResponse
    @GET("assets")
    fun getCryptoData(): Call<ApiResponse>
}

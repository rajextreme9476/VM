package com.rdx.virginemoney.data.RemoteData

import com.rdx.virginemoney.data.model.RoomItems
import retrofit2.Response
import retrofit2.http.GET

interface RoomsApi {

    @GET("rooms")
    suspend fun getRooms(): Response<RoomItems>




}
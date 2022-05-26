package com.rdx.virginemoney.data.RemoteData

import com.rdx.virginemoney.data.model.PeopleItems
import retrofit2.Response
import retrofit2.http.GET

interface PeopleApi {

    @GET("people")
    suspend fun getPeople(): Response<PeopleItems>




}
package com.dicoding.githubuserapp.api

import com.dicoding.githubuserapp.data.model.DetailUserResponse
import com.dicoding.githubuserapp.data.model.User
import com.dicoding.githubuserapp.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("/search/users")
    @Headers("Authorization: token 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")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("/users/{username}")
    @Headers("Authorization token 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")
    fun getUserDetail(
        @Path("username") username: String
    ):Call<DetailUserResponse>

    @GET("/users/{username}/followers")
    @Headers("Authorization token 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")
    fun getFollowers(
        @Path("username") username: String
    ):Call<ArrayList<User>>

    @GET("/users/{username}/following")
    @Headers("Authorization token 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")
    fun getFollowing(
        @Path("username") username: String
    ):Call<ArrayList<User>>
}
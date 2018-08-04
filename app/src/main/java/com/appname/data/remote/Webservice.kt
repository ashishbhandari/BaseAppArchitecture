package com.appname.data.remote


/**
 * @author ashish on 03,August,2018
 */

/**
 * Retrofit Webservice that communicates with our backend:
 */
interface Webservice {

    /**
     * @GET declares an HTTP GET request
     * @Path("user") annotation on the userId parameter marks it as a
     * replacement for the {user} placeholder in the @GET path
     */
//    @GET("/users/{user}")
//    fun getUser(@Path("user") userId: String): Call<User>
}
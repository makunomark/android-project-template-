package com.example.android_project_template.data.api

import com.parse.ParseException
import com.parse.ParseUser

internal object UserApi {

    @Throws(ParseException::class)
    suspend fun signUp(email: String, password: String, username: String) {
        val user = ParseUser()
        user.username = username
        user.setPassword(password)
        user.email = email
        user.signUp()
    }

    suspend fun signIn(username: String, password: String): ParseUser? {
        return ParseUser.logIn(username, password)
    }

}
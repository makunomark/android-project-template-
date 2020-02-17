package com.example.android_project_template.data.api

import com.parse.ParseException
import com.parse.ParseUser
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

internal object UserApi {

    @Throws(ParseException::class)
    suspend fun signUp(email: String, password: String, username: String) = withContext(Dispatchers.IO) {
        val user = ParseUser()
        user.username = username
        user.setPassword(password)
        user.email = email
        user.signUp()
    }

    @Throws(ParseException::class)
    suspend fun signIn(username: String, password: String): ParseUser? = withContext(Dispatchers.IO) {
        return@withContext ParseUser.logIn(username, password)
    }
}

package com.example.android_project_template.data.repository

import com.example.android_project_template.data.api.UserApi

internal class UserRepository {

    suspend fun signUp(email: String, password: String, username: String) {
        UserApi.signUp(email, password, username)
    }

    suspend fun login(username: String, password: String) {
        UserApi.signIn(username, password)
    }
}

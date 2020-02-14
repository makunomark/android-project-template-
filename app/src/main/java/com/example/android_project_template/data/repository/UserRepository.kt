package com.example.android_project_template.data.repository

import com.example.android_project_template.data.api.UserApi

internal class UserRepository(
    private val userApi: UserApi
) {
    suspend fun signUp(email: String, password: String, username: String) {
        userApi.signUp(email, password, username)
    }

    suspend fun login(username: String, password: String) {
        userApi.signIn(username, password)
    }
}

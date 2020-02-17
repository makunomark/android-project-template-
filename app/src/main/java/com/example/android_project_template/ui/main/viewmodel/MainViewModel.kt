package com.example.android_project_template.ui.main.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android_project_template.data.repository.UserRepository
import com.parse.ParseException
import kotlinx.coroutines.launch
import javax.inject.Inject

internal class MainViewModel
@Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    fun login(userName: String, password: String) {
        viewModelScope.launch {
            try {
                userRepository.login(userName, password)
            } catch (e: ParseException) {
                e.printStackTrace()
            }
        }
    }
}

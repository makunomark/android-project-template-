package com.example.android_project_template.ui.main.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.example.android_project_template.R
import com.example.android_project_template.di.util.DaggerViewModelFactory
import com.example.android_project_template.ui.main.viewmodel.MainViewModel
import dagger.android.AndroidInjection
import javax.inject.Inject

internal class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: DaggerViewModelFactory

    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)

        mainViewModel.getRemoteCharacters()
    }
}

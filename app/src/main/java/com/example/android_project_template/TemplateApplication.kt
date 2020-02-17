package com.example.android_project_template

import android.app.Application
import com.example.android_project_template.di.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject
import com.parse.Parse


internal class TemplateApplication : Application(), HasAndroidInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()

        DaggerApplicationComponent
            .builder()
            .application(this)
            .build()
            .inject(this)

        initParseSdk()
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return dispatchingAndroidInjector
    }

    private fun initParseSdk() {
        Parse.initialize(
            Parse.Configuration.Builder(this)
                .applicationId(BuildConfig.PARSE_SERVER_APP_ID)
                .server(BuildConfig.PARSE_SERVER_URL)
                .build()
        )
    }
}
package com.example.android_project_template.di

import android.app.Application
import com.example.android_project_template.TemplateApplication
import com.example.android_project_template.data.api.UserApi
import com.example.android_project_template.data.repository.UserRepository
import com.example.android_project_template.di.modules.*
import dagger.BindsInstance
import dagger.Component
import dagger.Provides
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        ActivityModule::class,
        ViewModelFactoryModule::class,
        ViewModelModule::class,
        RepositoryModule::class
    ]
)
internal interface ApplicationComponent {

    fun inject(application: TemplateApplication)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }
}

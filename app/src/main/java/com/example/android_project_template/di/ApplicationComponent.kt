package com.example.android_project_template.di

import com.example.android_project_template.TemplateApplication
import com.example.android_project_template.di.modules.ActivityModule
import com.example.android_project_template.di.modules.ViewModelFactoryModule
import com.example.android_project_template.di.modules.ViewModelModule
import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(
    modules = [
        AndroidInjectionModule::class,
        ActivityModule::class,
        ViewModelFactoryModule::class,
        ViewModelModule::class
    ]
)
internal interface ApplicationComponent {

    fun inject(application: TemplateApplication)
}

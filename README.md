## Android Project Template - With Parse Branch

This branch has been configured with the [Parse Platform Android SDK](https://github.com/parse-community/Parse-SDK-Android).

## Parse Server

For this project to run as intended, it needs configuration to an already running [Parse Server](https://github.com/parse-community/parse-server) instance. [This](https://github.com/makunomark/node-server-template) repository houses a bootstrapped server that would work with this branch out of the box. 
Just initialize the parse instance in `TemplateApplication.kt` with the correct `PARSE_SERVER_URL` and `PARSE_SERVER_APP_ID` values by creating and updating the values in `gradle.properties`. 

### Things you should know
1. Google App Indexing:
I have disabled Google App Indexing, for really no reason. If you'd like to allow Google to crawl through your app content, please refer to this [stackoverflow.com](stackoverflow.com) [answer](https://stackoverflow.com/a/34368811/2760868)

2. Content backup:
This template has `fullBackupContent` set to true (enabled). In case you would like for your application not to be backed up, please make the following update 
```diff
- android:fullBackupContent="false"
+ android:fullBackupContent="true"
``` 
3. Dependency injection: Dagger 2 (with dagger-android) has been set up. To start injecting activities, add a block similar but specific to your activity to `ActivityModule.kt` 
```kotlin
@ActivityScope
@ContributesAndroidInjector
fun provideMainActivity(): MainActivity
```

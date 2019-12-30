## Android Project Template

The intention of this project is to be a template with the industry standard setup of code and libraries.

### Things you should know
1. Google App Indexing:
I have disabled Google App Indexing, for really no reason. If you'd like to allow Google to crawl through your app content, please refer to this [stackoverflow.com](stackoverflow.com) [answer](https://stackoverflow.com/a/34368811/2760868)

2. Content backup:
This template has `fullBackupContent` set to true (enabled). In case you would like for your application not to be backed up, please make the following update 
```diff
- android:fullBackupContent="false"
+ android:fullBackupContent="true"
``` 

### To Do
[ ] Set up Dagger, and Document
[ ] Set up MVVM, and Document

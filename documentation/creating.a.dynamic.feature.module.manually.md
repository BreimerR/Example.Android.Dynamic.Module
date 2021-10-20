
This is a bit more tedious, but it has its efficiency benefits

1. Create a folder with the module name
   ```any name can work as this can be changed in settings.gradle.kts / settings.gradle```
2. Create a build.gradle.kts inside the named folder i.e. [auth] in
   [/features/accounts/types/admin/\[auth\]/build.gradle.kts](/features/accounts/types/admin/auth/build.gradle.kts)
    - Define Plugins required
      ```
       plugins {
        id("com.android.dynamic-feature")
        id("org.jetbrains.kotlin.android")
        id("kotlin-android")
       }
       ```
    - Define Project Android Structure
      ```
        android{
            compileSdk = 31 // your root project compileSdkVersion
            defaultConfig{
                minSdk = 29 // your root project minSdkVersion
            }
            ... Any Other Android specific gradle requirements 
        }
      ```
    - Add your dependencies
      ```
        dependencies{
            implementation(project(":app")) // app or the module the dynamic feature is utilised by
            ... other dependencies go here 
        }
      ```

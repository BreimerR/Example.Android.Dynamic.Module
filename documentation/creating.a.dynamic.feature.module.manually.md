# Manually Creating A Dynamic Feature Module

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

3. Create Working Directory Structure
    - Create [src](/features/accounts/types/admin/auth/src)

      > [src](/features/accounts/types/admin/auth/src)
      >> [/src/androidTest](/features/accounts/types/admin/auth/src/androidTest)
      >>
      >>> 
      >>> [/src/androidTest/java](/features/accounts/types/admin/auth/src/androidTest/java)
      >> 
      >>>> [/src/androidTest/java/libetal](/features/accounts/types/admin/auth/src/androidTest/java/libetal)
      >>> 
      >>>> [/src/androidTest/java/libetal/mobile](/features/accounts/types/admin/auth/src/androidTest/java/libetal/mobile)
      >
      >> [/src/main](/features/accounts/types/admin/auth/src/main)
      >>
      >>> [/src/main/java](/features/accounts/types/admin/auth/src/main/java)
      >>>
      >>>> [/src/main/java/libetal](/features/accounts/types/admin/auth/src/main/java/libetal)
      >>>
      >>>> [src/main/java/libetal/mobile](/features/accounts/types/admin/auth/src/main/java/libetal/mobile)
      >>
      >
      >> [/src/test](/features/accounts/types/admin/auth/src/test)
      > 
      >>> [/src/test/java](/features/accounts/types/admin/auth/src/test/java)  
      >> 
      >>>[/src/test/java/libetal](/features/accounts/types/admin/auth/src/test/java/libetal)
      >>
      >>>[/src/test/java/libetal/mobile](/features/accounts/types/admin/auth/src/test/java/libetal/mobile)


4. Add Your Manifest file
    - [main/AndroidManifest.xml](/features/accounts/types/admin/auth/src/main/AndroidManifest.xml)  
      ```<manifest xmlns:android="..." xmlns:dist="http://schemas.android.com/apk/distribution" package="...">```
      > Url  xmlns:dist required for <dist tags utilisation
      ```
      <dist:delivery>  
         <dist:[install-time|on-demand]
      </dist:delivery>
      ```
      > Defines When the module is installed
      > 1. on-demand ```installed on code request```
      > 2. install-time ```installed during application installation```
    

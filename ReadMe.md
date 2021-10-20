# Working With App Modules

# Creating A Dynamic App Module

## Methods

1. Using Android Studio
2. Manually

### Manually

This is a bit more tedious but it has it's efficiency benefits

1. Create a folder with the module name
   ```any name can work as this can be changed in settings.gradle.kts / settings.gradle```
2. Create a build.gradle.kts inside the named folder
   [example/build.gradle.kts](/features/accounts/types/admin/auth/build.gradle.kts)
   ```example/build.gradle.kts
   plugins{
      id("android)
   }
   ```

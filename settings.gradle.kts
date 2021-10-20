dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter() // Warning: this repository is going to shut down soon
    }
}
rootProject.name = "U-Served"

include(
    ":app",
    ":features:accounts:types:admin:auth",
    ":features:accounts:types:driver:auth",
    ":features:accounts:types:driver:messaging",
    ":features:accounts:types:driver:support",
    ":features:accounts:types:user:auth",
    ":features:accounts:types:user:messaging",
    ":features:accounts:types:user:support",
    ":features:accounts:types:external:auth",
    ":features:accounts:types:external:messaging",
    ":features:accounts:types:external:support",
    ":features:shared:authentication",
    ":features:shared:calls",
    ":features:shared:maps",
    ":features:shared:messaging",
    ":features:shared:support",
    ":libraries:messaging"
)
include(":test")
include(":features:shared:registration")

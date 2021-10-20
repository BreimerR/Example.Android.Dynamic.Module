plugins {
    id("com.android.application")
    id("kotlin-android")
}
android {

    /**
     * Adding Another feature to a current feature i.e
     * here we are adding :features:shared:registration
     * into :features:shared:authentication
     * */
    setDynamicFeatures(
        setOf(
            ":features:shared:registration"
        )
    )
}

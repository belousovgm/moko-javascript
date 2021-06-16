/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

object Deps {
    private const val kotlinTestVersion = "1.4.32"

    private const val androidAppCompatVersion = "1.1.0"
    private const val materialDesignVersion = "1.0.0"
    private const val androidLifecycleVersion = "2.1.0"
    private const val androidCoreTestingVersion = "1.3.0"
    private const val testJUnitExtVersion = "1.1.2"
    private const val quickjsVersion = "0.9.0"

    private const val coroutinesVersion = "1.4.2"
    private const val kotlinxSerializationVersion = "1.1.0"
    private const val mokoTestVersion = "0.3.0"

    const val mokoJavascriptVersion = "0.1.0"

    object Android {
        const val compileSdk = 30
        const val targetSdk = 30
        const val minSdk = 18
    }

    object Libs {
        object Android {
            const val appCompat = "androidx.appcompat:appcompat:$androidAppCompatVersion"
            const val material = "com.google.android.material:material:$materialDesignVersion"
            const val lifecycle = "androidx.lifecycle:lifecycle-extensions:$androidLifecycleVersion"

            const val kotlinTestJUnit = "org.jetbrains.kotlin:kotlin-test-junit:$kotlinTestVersion"
            const val testRunner = "androidx.test:runner:$androidCoreTestingVersion"
            const val testRules = "androidx.test:rules:$androidCoreTestingVersion"
            const val testJUnitExt = "androidx.test.ext:junit:$testJUnitExtVersion"
            const val testJUnitExtKtx = "androidx.test.ext:junit-ktx:$testJUnitExtVersion"

            const val quickjs = "app.cash.quickjs:quickjs-android:$quickjsVersion"
        }

        object MultiPlatform {
            const val coroutines =
                "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
            const val kotlinSerialization =
                "org.jetbrains.kotlinx:kotlinx-serialization-json:$kotlinxSerializationVersion"

            const val kotlinTest =
                "org.jetbrains.kotlin:kotlin-test-common:$kotlinTestVersion"
            const val kotlinTestAnnotations =
                "org.jetbrains.kotlin:kotlin-test-annotations-common:$kotlinTestVersion"
            const val mokoTest = "dev.icerock.moko:test-core:$mokoTestVersion"
            const val mokoTestRobolectric = "dev.icerock.moko:test-roboelectric:$mokoTestVersion"

            const val mokoJavascript = "dev.icerock.moko:javascript:$mokoJavascriptVersion"
        }
    }
}

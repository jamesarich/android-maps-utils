package com.google.maps.android.ktx

@RequiresOptIn
@Deprecated(
    message = "The KTX library functionality has been moved to com.google.maps.android. Use com.google.maps.android.MapsExperimentalFeature instead.",
    replaceWith = ReplaceWith("MapsExperimentalFeature", "com.google.maps.android.MapsExperimentalFeature"),
    level = DeprecationLevel.WARNING
)
public annotation class MapsExperimentalFeature

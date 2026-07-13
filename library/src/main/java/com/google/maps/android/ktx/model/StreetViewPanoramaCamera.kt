@file:Suppress("NOTHING_TO_INLINE")
package com.google.maps.android.ktx.model

import com.google.android.gms.maps.model.StreetViewPanoramaCamera
import com.google.maps.android.model.streetViewPanoramaCamera as canonical_streetViewPanoramaCamera

@Deprecated(
    message = "Use com.google.maps.android.model.streetViewPanoramaCamera instead",
    replaceWith = ReplaceWith("streetViewPanoramaCamera(optionsActions)", "com.google.maps.android.model.streetViewPanoramaCamera"),
    level = DeprecationLevel.WARNING
)
public inline fun streetViewPanoramaCamera(optionsActions: StreetViewPanoramaCamera.Builder.() -> Unit): StreetViewPanoramaCamera = canonical_streetViewPanoramaCamera(optionsActions)

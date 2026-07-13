@file:Suppress("NOTHING_TO_INLINE")
package com.google.maps.android.ktx.model

import com.google.android.gms.maps.model.StreetViewPanoramaOrientation
import com.google.maps.android.model.streetViewPanoramaOrientation as canonical_streetViewPanoramaOrientation

@Deprecated(
    message = "Use com.google.maps.android.model.streetViewPanoramaOrientation instead",
    replaceWith = ReplaceWith("streetViewPanoramaOrientation(optionsActions)", "com.google.maps.android.model.streetViewPanoramaOrientation"),
    level = DeprecationLevel.WARNING
)
public inline fun streetViewPanoramaOrientation(optionsActions: StreetViewPanoramaOrientation.Builder.() -> Unit): StreetViewPanoramaOrientation = canonical_streetViewPanoramaOrientation(optionsActions)

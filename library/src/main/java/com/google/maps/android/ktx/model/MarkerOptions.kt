@file:Suppress("NOTHING_TO_INLINE")
package com.google.maps.android.ktx.model

import com.google.android.gms.maps.model.MarkerOptions
import com.google.maps.android.model.markerOptions as canonical_markerOptions

@Deprecated(
    message = "Use com.google.maps.android.model.markerOptions instead",
    replaceWith = ReplaceWith("markerOptions(optionsActions)", "com.google.maps.android.model.markerOptions"),
    level = DeprecationLevel.WARNING
)
public inline fun markerOptions(optionsActions: MarkerOptions.() -> Unit): MarkerOptions = canonical_markerOptions(optionsActions)

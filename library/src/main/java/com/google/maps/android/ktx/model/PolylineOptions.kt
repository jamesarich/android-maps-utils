@file:Suppress("NOTHING_TO_INLINE")
package com.google.maps.android.ktx.model

import com.google.android.gms.maps.model.PolylineOptions
import com.google.maps.android.model.polylineOptions as canonical_polylineOptions

@Deprecated(
    message = "Use com.google.maps.android.model.polylineOptions instead",
    replaceWith = ReplaceWith("polylineOptions(optionsActions)", "com.google.maps.android.model.polylineOptions"),
    level = DeprecationLevel.WARNING
)
public inline fun polylineOptions(optionsActions: PolylineOptions.() -> Unit): PolylineOptions = canonical_polylineOptions(optionsActions)

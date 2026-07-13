@file:Suppress("NOTHING_TO_INLINE")
package com.google.maps.android.ktx.model

import com.google.android.gms.maps.model.PolygonOptions
import com.google.maps.android.model.polygonOptions as canonical_polygonOptions

@Deprecated(
    message = "Use com.google.maps.android.model.polygonOptions instead",
    replaceWith = ReplaceWith("polygonOptions(optionsActions)", "com.google.maps.android.model.polygonOptions"),
    level = DeprecationLevel.WARNING
)
public inline fun polygonOptions(optionsActions: PolygonOptions.() -> Unit): PolygonOptions = canonical_polygonOptions(optionsActions)

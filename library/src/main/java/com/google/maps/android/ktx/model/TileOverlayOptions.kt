@file:Suppress("NOTHING_TO_INLINE")
package com.google.maps.android.ktx.model

import com.google.android.gms.maps.model.TileOverlayOptions
import com.google.maps.android.model.tileOverlayOptions as canonical_tileOverlayOptions

@Deprecated(
    message = "Use com.google.maps.android.model.tileOverlayOptions instead",
    replaceWith = ReplaceWith("tileOverlayOptions(optionsActions)", "com.google.maps.android.model.tileOverlayOptions"),
    level = DeprecationLevel.WARNING
)
public inline fun tileOverlayOptions(optionsActions: TileOverlayOptions.() -> Unit): TileOverlayOptions = canonical_tileOverlayOptions(optionsActions)

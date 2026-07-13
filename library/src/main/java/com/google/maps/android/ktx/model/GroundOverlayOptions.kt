@file:Suppress("NOTHING_TO_INLINE")
package com.google.maps.android.ktx.model

import com.google.android.gms.maps.model.GroundOverlayOptions
import com.google.maps.android.model.groundOverlayOptions as canonical_groundOverlayOptions

@Deprecated(
    message = "Use com.google.maps.android.model.groundOverlayOptions instead",
    replaceWith = ReplaceWith("groundOverlayOptions(optionsActions)", "com.google.maps.android.model.groundOverlayOptions"),
    level = DeprecationLevel.WARNING
)
public inline fun groundOverlayOptions(optionsActions: GroundOverlayOptions.() -> Unit): GroundOverlayOptions = canonical_groundOverlayOptions(optionsActions)

@file:Suppress("NOTHING_TO_INLINE")
package com.google.maps.android.ktx.model

import com.google.android.gms.maps.model.CameraPosition
import com.google.maps.android.model.cameraPosition as canonical_cameraPosition

@Deprecated(
    message = "Use com.google.maps.android.model.cameraPosition instead",
    replaceWith = ReplaceWith("cameraPosition(optionsActions)", "com.google.maps.android.model.cameraPosition"),
    level = DeprecationLevel.WARNING
)
public inline fun cameraPosition(optionsActions: CameraPosition.Builder.() -> Unit): CameraPosition = canonical_cameraPosition(optionsActions)

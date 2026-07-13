@file:Suppress("NOTHING_TO_INLINE")
package com.google.maps.android.ktx.utils

import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Polyline
import com.google.maps.android.contains as canonicalContains
import com.google.maps.android.sphericalPathLength as canonicalSphericalPathLength

@Deprecated("Moved to com.google.maps.android.contains", ReplaceWith("contains(latLng, tolerance)", "com.google.maps.android.contains"))
public inline fun Polyline.contains(latLng: LatLng, tolerance: Double = 0.1): Boolean = this.canonicalContains(latLng, tolerance)

@Deprecated("Moved to com.google.maps.android.sphericalPathLength", ReplaceWith("sphericalPathLength", "com.google.maps.android.sphericalPathLength"))
public inline val Polyline.sphericalPathLength: Double get() = this.canonicalSphericalPathLength

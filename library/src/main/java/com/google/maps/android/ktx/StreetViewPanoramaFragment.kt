@file:Suppress("NOTHING_TO_INLINE")
package com.google.maps.android.ktx

import com.google.android.gms.maps.StreetViewPanorama
import com.google.android.gms.maps.StreetViewPanoramaFragment
import com.google.maps.android.awaitStreetViewPanorama as canonicalAwaitStreetViewPanorama

@Deprecated(
    message = "Use com.google.maps.android.awaitStreetViewPanorama instead",
    replaceWith = ReplaceWith("awaitStreetViewPanorama()", "com.google.maps.android.awaitStreetViewPanorama"),
    level = DeprecationLevel.WARNING
)
public suspend inline fun StreetViewPanoramaFragment.awaitStreetViewPanorama(): StreetViewPanorama = this.canonicalAwaitStreetViewPanorama()

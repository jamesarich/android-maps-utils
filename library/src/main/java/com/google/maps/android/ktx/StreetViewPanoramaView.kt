@file:Suppress("NOTHING_TO_INLINE")
package com.google.maps.android.ktx

import com.google.android.gms.maps.StreetViewPanorama
import com.google.android.gms.maps.StreetViewPanoramaView
import com.google.android.gms.maps.model.StreetViewPanoramaCamera
import com.google.android.gms.maps.model.StreetViewPanoramaLocation
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation
import kotlinx.coroutines.flow.Flow
import com.google.maps.android.awaitStreetViewPanorama as canonicalAwaitStreetViewPanorama
import com.google.maps.android.cameraChangeEvents as canonicalCameraChangeEvents
import com.google.maps.android.changeEvents as canonicalChangeEvents
import com.google.maps.android.clickEvents as canonicalClickEvents
import com.google.maps.android.longClickEvents as canonicalLongClickEvents

@Deprecated(
    message = "Use com.google.maps.android.awaitStreetViewPanorama instead",
    replaceWith = ReplaceWith("awaitStreetViewPanorama()", "com.google.maps.android.awaitStreetViewPanorama"),
    level = DeprecationLevel.WARNING
)
public suspend inline fun StreetViewPanoramaView.awaitStreetViewPanorama(): StreetViewPanorama = this.canonicalAwaitStreetViewPanorama()

@Deprecated(
    message = "Use com.google.maps.android.cameraChangeEvents instead",
    replaceWith = ReplaceWith("cameraChangeEvents()", "com.google.maps.android.cameraChangeEvents"),
    level = DeprecationLevel.WARNING
)
public fun StreetViewPanorama.cameraChangeEvents(): Flow<StreetViewPanoramaCamera> = this.canonicalCameraChangeEvents()

@Deprecated(
    message = "Use com.google.maps.android.changeEvents instead",
    replaceWith = ReplaceWith("changeEvents()", "com.google.maps.android.changeEvents"),
    level = DeprecationLevel.WARNING
)
public fun StreetViewPanorama.changeEvents(): Flow<StreetViewPanoramaLocation> = this.canonicalChangeEvents()

@Deprecated(
    message = "Use com.google.maps.android.clickEvents instead",
    replaceWith = ReplaceWith("clickEvents()", "com.google.maps.android.clickEvents"),
    level = DeprecationLevel.WARNING
)
public fun StreetViewPanorama.clickEvents(): Flow<StreetViewPanoramaOrientation> = this.canonicalClickEvents()

@Deprecated(
    message = "Use com.google.maps.android.longClickEvents instead",
    replaceWith = ReplaceWith("longClickEvents()", "com.google.maps.android.longClickEvents"),
    level = DeprecationLevel.WARNING
)
public fun StreetViewPanorama.longClickEvents(): Flow<StreetViewPanoramaOrientation> = this.canonicalLongClickEvents()

@file:Suppress("NOTHING_TO_INLINE")
package com.google.maps.android.ktx.utils.collection

import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.coroutines.flow.Flow
import com.google.maps.android.collections.MarkerManager
import com.google.maps.android.collections.addMarker as canonical_addMarker
import com.google.maps.android.collections.clickEvents as canonicalClickEvents
import com.google.maps.android.collections.infoWindowClickEvents as canonicalInfoWindowClickEvents
import com.google.maps.android.collections.infoWindowLongClickEvents as canonicalInfoWindowLongClickEvents

@Deprecated(
    message = "Use com.google.maps.android.collections.addMarker instead",
    replaceWith = ReplaceWith("addMarker(optionsActions)", "com.google.maps.android.collections.addMarker"),
    level = DeprecationLevel.WARNING
)
public inline fun MarkerManager.Collection.addMarker(optionsActions: MarkerOptions.() -> Unit): Marker = this.canonical_addMarker(optionsActions)

@Deprecated("Moved to com.google.maps.android.collections.clickEvents", ReplaceWith("clickEvents()", "com.google.maps.android.collections.clickEvents"))
public fun MarkerManager.Collection.clickEvents(): Flow<Marker> = this.canonicalClickEvents()

@Deprecated("Moved to com.google.maps.android.collections.infoWindowClickEvents", ReplaceWith("infoWindowClickEvents()", "com.google.maps.android.collections.infoWindowClickEvents"))
public fun MarkerManager.Collection.infoWindowClickEvents(): Flow<Marker> = this.canonicalInfoWindowClickEvents()

@Deprecated("Moved to com.google.maps.android.collections.infoWindowLongClickEvents", ReplaceWith("infoWindowLongClickEvents()", "com.google.maps.android.collections.infoWindowLongClickEvents"))
public fun MarkerManager.Collection.infoWindowLongClickEvents(): Flow<Marker> = this.canonicalInfoWindowLongClickEvents()

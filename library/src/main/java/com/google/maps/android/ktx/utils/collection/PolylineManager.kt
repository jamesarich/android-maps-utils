@file:Suppress("NOTHING_TO_INLINE")
package com.google.maps.android.ktx.utils.collection

import com.google.android.gms.maps.model.Polyline
import com.google.android.gms.maps.model.PolylineOptions
import kotlinx.coroutines.flow.Flow
import com.google.maps.android.collections.PolylineManager
import com.google.maps.android.collections.addPolyline as canonical_addPolyline
import com.google.maps.android.collections.clickEvents as canonicalClickEvents
import com.google.maps.android.collections.infoWindowClickEvents as canonicalInfoWindowClickEvents
import com.google.maps.android.collections.infoWindowLongClickEvents as canonicalInfoWindowLongClickEvents

@Deprecated(
    message = "Use com.google.maps.android.collections.addPolyline instead",
    replaceWith = ReplaceWith("addPolyline(optionsActions)", "com.google.maps.android.collections.addPolyline"),
    level = DeprecationLevel.WARNING
)
public inline fun PolylineManager.Collection.addPolyline(optionsActions: PolylineOptions.() -> Unit): Polyline = this.canonical_addPolyline(optionsActions)

@Deprecated("Moved to com.google.maps.android.collections.clickEvents", ReplaceWith("clickEvents()", "com.google.maps.android.collections.clickEvents"))
public fun PolylineManager.Collection.clickEvents(): Flow<Polyline> = this.canonicalClickEvents()

@file:Suppress("NOTHING_TO_INLINE")
package com.google.maps.android.ktx.utils.collection

import com.google.android.gms.maps.model.Polygon
import com.google.android.gms.maps.model.PolygonOptions
import kotlinx.coroutines.flow.Flow
import com.google.maps.android.collections.PolygonManager
import com.google.maps.android.collections.addPolygon as canonical_addPolygon
import com.google.maps.android.collections.clickEvents as canonicalClickEvents
import com.google.maps.android.collections.infoWindowClickEvents as canonicalInfoWindowClickEvents
import com.google.maps.android.collections.infoWindowLongClickEvents as canonicalInfoWindowLongClickEvents

@Deprecated(
    message = "Use com.google.maps.android.collections.addPolygon instead",
    replaceWith = ReplaceWith("addPolygon(optionsActions)", "com.google.maps.android.collections.addPolygon"),
    level = DeprecationLevel.WARNING
)
public inline fun PolygonManager.Collection.addPolygon(optionsActions: PolygonOptions.() -> Unit): Polygon = this.canonical_addPolygon(optionsActions)

@Deprecated("Moved to com.google.maps.android.collections.clickEvents", ReplaceWith("clickEvents()", "com.google.maps.android.collections.clickEvents"))
public fun PolygonManager.Collection.clickEvents(): Flow<Polygon> = this.canonicalClickEvents()

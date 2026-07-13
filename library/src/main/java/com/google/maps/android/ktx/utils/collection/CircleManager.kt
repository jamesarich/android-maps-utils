@file:Suppress("NOTHING_TO_INLINE")
package com.google.maps.android.ktx.utils.collection

import com.google.android.gms.maps.model.Circle
import com.google.android.gms.maps.model.CircleOptions
import kotlinx.coroutines.flow.Flow
import com.google.maps.android.collections.CircleManager
import com.google.maps.android.collections.addCircle as canonical_addCircle
import com.google.maps.android.collections.clickEvents as canonicalClickEvents
import com.google.maps.android.collections.infoWindowClickEvents as canonicalInfoWindowClickEvents
import com.google.maps.android.collections.infoWindowLongClickEvents as canonicalInfoWindowLongClickEvents

@Deprecated(
    message = "Use com.google.maps.android.collections.addCircle instead",
    replaceWith = ReplaceWith("addCircle(optionsActions)", "com.google.maps.android.collections.addCircle"),
    level = DeprecationLevel.WARNING
)
public inline fun CircleManager.Collection.addCircle(optionsActions: CircleOptions.() -> Unit): Circle = this.canonical_addCircle(optionsActions)

@Deprecated("Moved to com.google.maps.android.collections.clickEvents", ReplaceWith("clickEvents()", "com.google.maps.android.collections.clickEvents"))
public fun CircleManager.Collection.clickEvents(): Flow<Circle> = this.canonicalClickEvents()

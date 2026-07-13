@file:Suppress("NOTHING_TO_INLINE")
package com.google.maps.android.ktx.utils.collection

import com.google.android.gms.maps.model.GroundOverlay
import com.google.android.gms.maps.model.GroundOverlayOptions
import kotlinx.coroutines.flow.Flow
import com.google.maps.android.collections.GroundOverlayManager
import com.google.maps.android.collections.addGroundOverlay as canonical_addGroundOverlay
import com.google.maps.android.collections.clickEvents as canonicalClickEvents
import com.google.maps.android.collections.infoWindowClickEvents as canonicalInfoWindowClickEvents
import com.google.maps.android.collections.infoWindowLongClickEvents as canonicalInfoWindowLongClickEvents

@Deprecated(
    message = "Use com.google.maps.android.collections.addGroundOverlay instead",
    replaceWith = ReplaceWith("addGroundOverlay(optionsActions)", "com.google.maps.android.collections.addGroundOverlay"),
    level = DeprecationLevel.WARNING
)
public inline fun GroundOverlayManager.Collection.addGroundOverlay(optionsActions: GroundOverlayOptions.() -> Unit): GroundOverlay = this.canonical_addGroundOverlay(optionsActions)

@Deprecated("Moved to com.google.maps.android.collections.clickEvents", ReplaceWith("clickEvents()", "com.google.maps.android.collections.clickEvents"))
public fun GroundOverlayManager.Collection.clickEvents(): Flow<GroundOverlay> = this.canonicalClickEvents()

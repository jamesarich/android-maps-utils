@file:Suppress("NOTHING_TO_INLINE")
package com.google.maps.android.ktx

import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapFragment
import com.google.maps.android.awaitMap as canonicalAwaitMap

@Deprecated(
    message = "Use com.google.maps.android.awaitMap instead",
    replaceWith = ReplaceWith("awaitMap()", "com.google.maps.android.awaitMap"),
    level = DeprecationLevel.WARNING
)
public suspend inline fun MapFragment.awaitMap(): GoogleMap = this.canonicalAwaitMap()

package com.google.maps.android.ktx.utils.location

import android.Manifest
import android.location.Location
import android.location.LocationManager
import androidx.annotation.RequiresPermission
import kotlinx.coroutines.flow.Flow
import com.google.maps.android.location.coarseLocationEvents as canonicalCoarseLocationEvents
import com.google.maps.android.location.fineLocationEvents as canonicalFineLocationEvents

@RequiresPermission(Manifest.permission.ACCESS_COARSE_LOCATION)
@Deprecated("Moved to com.google.maps.android.location.coarseLocationEvents", ReplaceWith("coarseLocationEvents(minTimeMs, minDistanceM)", "com.google.maps.android.location.coarseLocationEvents"))
public fun LocationManager.coarseLocationEvents(
    minTimeMs: Long = 1000L,
    minDistanceM: Float = 1f
): Flow<Location> = this.canonicalCoarseLocationEvents(minTimeMs, minDistanceM)

@RequiresPermission(Manifest.permission.ACCESS_FINE_LOCATION)
@Deprecated("Moved to com.google.maps.android.location.fineLocationEvents", ReplaceWith("fineLocationEvents(minTimeMs, minDistanceM)", "com.google.maps.android.location.fineLocationEvents"))
public fun LocationManager.fineLocationEvents(
    minTimeMs: Long = 1000L,
    minDistanceM: Float = 1f
): Flow<Location> = this.canonicalFineLocationEvents(minTimeMs, minDistanceM)

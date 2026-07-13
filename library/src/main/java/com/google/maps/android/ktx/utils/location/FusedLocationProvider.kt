package com.google.maps.android.ktx.utils.location

import android.Manifest
import android.location.Location
import android.os.Looper
import androidx.annotation.RequiresPermission
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.Priority
import kotlinx.coroutines.flow.Flow
import com.google.maps.android.location.locationEvents as canonicalLocationEvents
import com.google.maps.android.location.fusedLocationEvents as canonicalFusedLocationEvents

@RequiresPermission(anyOf = [Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION])
@Deprecated("Moved to com.google.maps.android.location.locationEvents", ReplaceWith("locationEvents(locationRequest, looper)", "com.google.maps.android.location.locationEvents"))
public fun FusedLocationProviderClient.locationEvents(
    locationRequest: LocationRequest,
    looper: Looper = Looper.getMainLooper()
): Flow<Location> = this.canonicalLocationEvents(locationRequest, looper)

@RequiresPermission(anyOf = [Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION])
@Deprecated("Moved to com.google.maps.android.location.fusedLocationEvents", ReplaceWith("fusedLocationEvents(intervalMs, minUpdateDistanceM, priority, looper)", "com.google.maps.android.location.fusedLocationEvents"))
public fun FusedLocationProviderClient.fusedLocationEvents(
    intervalMs: Long = 2000L,
    minUpdateDistanceM: Float = 1f,
    priority: Int = Priority.PRIORITY_HIGH_ACCURACY,
    looper: Looper = Looper.getMainLooper()
): Flow<Location> = this.canonicalFusedLocationEvents(intervalMs, minUpdateDistanceM, priority, looper)

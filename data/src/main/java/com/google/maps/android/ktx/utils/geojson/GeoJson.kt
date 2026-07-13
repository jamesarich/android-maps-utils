@file:Suppress("NOTHING_TO_INLINE")
package com.google.maps.android.ktx.utils.geojson

import android.content.Context
import androidx.annotation.RawRes
import com.google.android.gms.maps.GoogleMap
import com.google.maps.android.collections.GroundOverlayManager
import com.google.maps.android.collections.MarkerManager
import com.google.maps.android.collections.PolygonManager
import com.google.maps.android.collections.PolylineManager
import com.google.maps.android.data.geojson.GeoJsonLayer
import org.json.JSONObject
import com.google.maps.android.data.geojson.geoJsonLayer as canonicalGeoJsonLayer

@Deprecated("Moved to com.google.maps.android.data.geojson.geoJsonLayer", ReplaceWith("geoJsonLayer(map, geoJsonFile, markerManager, polygonManager, polylineManager, groundOverlayManager)", "com.google.maps.android.data.geojson.geoJsonLayer"))
public inline fun geoJsonLayer(
    map: GoogleMap,
    geoJsonFile: JSONObject,
    markerManager: MarkerManager? = null,
    polygonManager: PolygonManager? = null,
    polylineManager: PolylineManager? = null,
    groundOverlayManager: GroundOverlayManager? = null
): GeoJsonLayer = canonicalGeoJsonLayer(map, geoJsonFile, markerManager, polygonManager, polylineManager, groundOverlayManager)

@Deprecated("Moved to com.google.maps.android.data.geojson.geoJsonLayer", ReplaceWith("geoJsonLayer(map, resourceId, context, markerManager, polygonManager, polylineManager, groundOverlayManager)", "com.google.maps.android.data.geojson.geoJsonLayer"))
public inline fun geoJsonLayer(
    map: GoogleMap,
    @RawRes resourceId: Int,
    context: Context,
    markerManager: MarkerManager? = null,
    polygonManager: PolygonManager? = null,
    polylineManager: PolylineManager? = null,
    groundOverlayManager: GroundOverlayManager? = null
): GeoJsonLayer = canonicalGeoJsonLayer(map, resourceId, context, markerManager, polygonManager, polylineManager, groundOverlayManager)

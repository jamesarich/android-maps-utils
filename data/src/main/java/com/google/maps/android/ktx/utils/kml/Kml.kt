@file:Suppress("NOTHING_TO_INLINE")
package com.google.maps.android.ktx.utils.kml

import android.content.Context
import androidx.annotation.RawRes
import com.google.android.gms.maps.GoogleMap
import com.google.maps.android.collections.GroundOverlayManager
import com.google.maps.android.collections.MarkerManager
import com.google.maps.android.collections.PolygonManager
import com.google.maps.android.collections.PolylineManager
import com.google.maps.android.data.Renderer
import com.google.maps.android.data.kml.KmlLayer
import java.io.InputStream
import com.google.maps.android.data.kml.kmlLayer as canonicalKmlLayer

@Deprecated("Moved to com.google.maps.android.data.kml.kmlLayer", ReplaceWith("kmlLayer(map, resourceId, context, markerManager, polygonManager, polylineManager, groundOverlayManager, imagesCache)", "com.google.maps.android.data.kml.kmlLayer"))
public inline fun kmlLayer(
    map: GoogleMap,
    @RawRes resourceId: Int,
    context: Context,
    markerManager: MarkerManager = MarkerManager(map),
    polygonManager: PolygonManager = PolygonManager(map),
    polylineManager: PolylineManager = PolylineManager(map),
    groundOverlayManager: GroundOverlayManager = GroundOverlayManager(map),
    imagesCache: Renderer.ImagesCache? = null
): KmlLayer = canonicalKmlLayer(map, resourceId, context, markerManager, polygonManager, polylineManager, groundOverlayManager, imagesCache)

@Deprecated("Moved to com.google.maps.android.data.kml.kmlLayer", ReplaceWith("kmlLayer(map, stream, context, markerManager, polygonManager, polylineManager, groundOverlayManager, imagesCache)", "com.google.maps.android.data.kml.kmlLayer"))
public inline fun kmlLayer(
    map: GoogleMap,
    stream: InputStream,
    context: Context,
    markerManager: MarkerManager = MarkerManager(map),
    polygonManager: PolygonManager = PolygonManager(map),
    polylineManager: PolylineManager = PolylineManager(map),
    groundOverlayManager: GroundOverlayManager = GroundOverlayManager(map),
    imagesCache: Renderer.ImagesCache? = null
): KmlLayer = canonicalKmlLayer(map, stream, context, markerManager, polygonManager, polylineManager, groundOverlayManager, imagesCache)

@file:Suppress("NOTHING_TO_INLINE")
package com.google.maps.android.ktx.utils.heatmaps

import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.heatmaps.Gradient
import com.google.maps.android.heatmaps.HeatmapTileProvider
import com.google.maps.android.heatmaps.WeightedLatLng
import com.google.maps.android.heatmaps.toWeightedLatLng as canonicalToWeightedLatLng
import com.google.maps.android.heatmaps.heatmapTileProviderWithData as canonicalHeatmapTileProviderWithData
import com.google.maps.android.heatmaps.heatmapTileProviderWithWeightedData as canonicalHeatmapTileProviderWithWeightedData

@Deprecated("Moved to com.google.maps.android.heatmaps.toWeightedLatLng", ReplaceWith("toWeightedLatLng(intensity)", "com.google.maps.android.heatmaps.toWeightedLatLng"))
public inline fun LatLng.toWeightedLatLng(
    intensity: Double = WeightedLatLng.DEFAULT_INTENSITY
): WeightedLatLng = this.canonicalToWeightedLatLng(intensity)

@Deprecated("Moved to com.google.maps.android.heatmaps.heatmapTileProviderWithData", ReplaceWith("heatmapTileProviderWithData(latLngs, radius, gradient, opacity, maxIntensity)", "com.google.maps.android.heatmaps.heatmapTileProviderWithData"))
public inline fun heatmapTileProviderWithData(
    latLngs: Collection<LatLng>,
    radius: Int = HeatmapTileProvider.DEFAULT_RADIUS,
    gradient: Gradient = HeatmapTileProvider.DEFAULT_GRADIENT,
    opacity: Double = HeatmapTileProvider.DEFAULT_OPACITY,
    maxIntensity: Double = 0.0
) : HeatmapTileProvider = canonicalHeatmapTileProviderWithData(latLngs, radius, gradient, opacity, maxIntensity)

@Deprecated("Moved to com.google.maps.android.heatmaps.heatmapTileProviderWithWeightedData", ReplaceWith("heatmapTileProviderWithWeightedData(latLngs, radius, gradient, opacity, maxIntensity)", "com.google.maps.android.heatmaps.heatmapTileProviderWithWeightedData"))
public inline fun heatmapTileProviderWithWeightedData(
    latLngs: Collection<WeightedLatLng>,
    radius: Int = HeatmapTileProvider.DEFAULT_RADIUS,
    gradient: Gradient = HeatmapTileProvider.DEFAULT_GRADIENT,
    opacity: Double = HeatmapTileProvider.DEFAULT_OPACITY,
    maxIntensity: Double = 0.0
) : HeatmapTileProvider = canonicalHeatmapTileProviderWithWeightedData(latLngs, radius, gradient, opacity, maxIntensity)

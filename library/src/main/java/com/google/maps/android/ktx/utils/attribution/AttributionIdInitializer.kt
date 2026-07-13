package com.google.maps.android.ktx.utils.attribution

import android.content.Context
import androidx.annotation.Keep
import androidx.startup.Initializer
import com.google.android.gms.maps.MapsApiSettings
import com.google.maps.android.utils.meta.AttributionId

@Keep
@Deprecated(
    message = "Use com.google.maps.android.utils.attribution.AttributionIdInitializer instead",
    replaceWith = ReplaceWith("AttributionIdInitializer", "com.google.maps.android.utils.attribution.AttributionIdInitializer"),
    level = DeprecationLevel.WARNING
)
internal class AttributionIdInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        MapsApiSettings.addInternalUsageAttributionId(
            context,
            AttributionId.VALUE
        )
    }

    override fun dependencies(): List<Class<out Initializer<*>>> = emptyList()
}

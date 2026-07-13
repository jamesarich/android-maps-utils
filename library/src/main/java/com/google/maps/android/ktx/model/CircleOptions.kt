@file:Suppress("NOTHING_TO_INLINE")
package com.google.maps.android.ktx.model

import com.google.android.gms.maps.model.CircleOptions
import com.google.maps.android.model.circleOptions as canonical_circleOptions

@Deprecated(
    message = "Use com.google.maps.android.model.circleOptions instead",
    replaceWith = ReplaceWith("circleOptions(optionsActions)", "com.google.maps.android.model.circleOptions"),
    level = DeprecationLevel.WARNING
)
public inline fun circleOptions(optionsActions: CircleOptions.() -> Unit): CircleOptions = canonical_circleOptions(optionsActions)

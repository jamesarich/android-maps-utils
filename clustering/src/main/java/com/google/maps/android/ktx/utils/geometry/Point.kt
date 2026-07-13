@file:Suppress("NOTHING_TO_INLINE")
package com.google.maps.android.ktx.utils.geometry

import com.google.maps.android.geometry.Point
import com.google.maps.android.geometry.component1 as canonicalComponent1
import com.google.maps.android.geometry.component2 as canonicalComponent2

@Deprecated("Moved to com.google.maps.android.geometry.component1", ReplaceWith("component1()", "com.google.maps.android.geometry.component1"))
public inline operator fun Point.component1(): Double = this.canonicalComponent1()

@Deprecated("Moved to com.google.maps.android.geometry.component2", ReplaceWith("component2()", "com.google.maps.android.geometry.component2"))
public inline operator fun Point.component2(): Double = this.canonicalComponent2()

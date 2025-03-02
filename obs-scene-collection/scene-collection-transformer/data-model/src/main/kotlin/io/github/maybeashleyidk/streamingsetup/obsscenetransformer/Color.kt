package io.github.maybeashleyidk.streamingsetup.obsscenetransformer

import kotlin.math.roundToInt

@JvmInline
public value class RgbColor(public val rgb: Int) {

	init {
		require((rgb.toUInt() and 0xFF000000u) == 0u)
	}

	override fun toString(): String {
		@OptIn(ExperimentalStdlibApi::class)
		return '#' +
			this.rgb
				.toHexString()
				.trimStart('0')
				.padStart(length = 6, padChar = '0')
	}
}

@JvmInline
public value class ArgbColor(public val argb: UInt) {

	override fun toString(): String {
		@OptIn(ExperimentalStdlibApi::class)
		return '#' +
			this.argb
				.toHexString()
				.padStart(length = 8, padChar = '0')
	}
}

@Suppress("FunctionName")
public fun Color(
	red: Int,
	green: Int,
	blue: Int,
): RgbColor {
	val r: Int = (red and 0xFF) shl 16
	val g: Int = (green and 0xFF) shl 8
	val b: Int = (blue and 0xFF)
	return RgbColor(r or g or b)
}

@Suppress("FunctionName")
public fun Color(
	alpha: Float,
	red: Int,
	green: Int,
	blue: Int,
): ArgbColor {
	val a: UInt = (alpha.coerceIn(0f..1f) * 0xFF).roundToInt().toUInt() shl 24
	val r: UInt = (red and 0xFF).toUInt() shl 16
	val g: UInt = (green and 0xFF).toUInt() shl 8
	val b: UInt = (blue and 0xFF).toUInt()
	return ArgbColor(a or r or g or b)
}

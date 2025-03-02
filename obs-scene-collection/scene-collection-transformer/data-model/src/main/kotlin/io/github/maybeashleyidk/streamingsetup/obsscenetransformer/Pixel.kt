package io.github.maybeashleyidk.streamingsetup.obsscenetransformer

import java.math.BigDecimal

@JvmInline
public value class Pixel(public val value: Long) : Comparable<Pixel> {

	override fun compareTo(other: Pixel): Int {
		return this.value.compareTo(other.value)
	}

	override fun toString(): String {
		return "${this.value} px"
	}

	public companion object {
		public val Zero: Pixel = Pixel(0)
	}
}

@JvmInline
public value class Subpixel(public val value: BigDecimal) : Comparable<Subpixel> {

	override fun compareTo(other: Subpixel): Int {
		return this.value.compareTo(other.value)
	}

	public operator fun compareTo(pixel: Pixel): Int {
		return this.value.compareTo(pixel.value.toBigDecimal())
	}

	override fun toString(): String {
		return "${this.value} px"
	}

	public companion object {
		public val Zero: Subpixel = Subpixel(BigDecimal.ZERO)
	}
}

public fun Pixel.toSubpixel(): Subpixel {
	return Subpixel(this.value.toBigDecimal())
}

public operator fun Pixel.compareTo(subpixel: Subpixel): Int {
	return this.toSubpixel().compareTo(subpixel)
}

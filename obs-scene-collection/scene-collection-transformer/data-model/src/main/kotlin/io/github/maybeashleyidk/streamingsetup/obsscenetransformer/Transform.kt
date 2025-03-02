package io.github.maybeashleyidk.streamingsetup.obsscenetransformer

public data class Transform(
	public val position: Position,
	public val size: Size,
	public val positionalAlignment: PositionalAlignment,
	public val crop: Crop,
)

public data class Position(public val x: Subpixel, public val y: Subpixel)

public data class Size(public val width: Subpixel, public val height: Subpixel) {

	init {
		require(width >= Subpixel.Zero)
		require(height >= Subpixel.Zero)
	}
}

public enum class PositionalAlignment {
	TopCenter,
	TopRight,
	Center,
	BottomLeft,
	BottomCenter,
}

public data class Crop(
	public val left: Pixel,
	public val right: Pixel,
	public val top: Pixel,
	public val bottom: Pixel,
)

package io.github.maybeashleyidk.streamingsetup.obsscenetransformer.source

import io.github.maybeashleyidk.streamingsetup.obsscenetransformer.ArgbColor
import io.github.maybeashleyidk.streamingsetup.obsscenetransformer.Pixel

public data class ApplicationAudioCapture(
	public val matchPriority: MatchPriority,
	public val application: String,
) : SourceProperties() {

	public enum class MatchPriority {
		MatchByBinaryNameFallbackToAppName,
		MatchByAppNameFallbackToBinaryName,
	}
}

public data object AudioInputCapture : SourceProperties()

public data class Browser(
	public val url: String,
	public val width: Pixel,
	public val height: Pixel,
	public val controlAudioViaObs: Boolean,
	public val fps: Int,
	public val customCss: String?,
) : SourceProperties() {

	init {
		require(width >= Pixel.Zero)
		require(height >= Pixel.Zero)
		require(fps in 1..60)
	}
}

public data class ColorSource(
	public val color: ArgbColor,
	public val width: Pixel,
	public val height: Pixel,
) : SourceProperties() {

	init {
		require(width >= Pixel.Zero)
		require(height >= Pixel.Zero)
	}
}

public data class Image(
	public val imageFile: String,
) : SourceProperties()

public data class ImageSlideShow(
	public val imageFiles: List<String>,
) : SourceProperties()

public data object ScreenCapture : SourceProperties()

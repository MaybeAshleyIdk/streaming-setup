package io.github.maybeashleyidk.streamingsetup.obsscenetransformer.source

import io.github.maybeashleyidk.streamingsetup.obsscenetransformer.Decibel
import io.github.maybeashleyidk.streamingsetup.obsscenetransformer.RgbColor

public sealed class Filter

public data class ColorCorrection(
	public val opacity: Float,
	public val colorMultiply: RgbColor,
) : Filter() {

	init {
		require(opacity in 0f..1f)
	}
}

public data class NoiseSuppression(
	public val method: Method,
) : Filter() {

	public enum class Method {
		Speex,
		RNNoise
	}
}

public data class NoiseGate(
	public val closeThreshold: Decibel,
	public val openThreshold: Decibel,
) : Filter()

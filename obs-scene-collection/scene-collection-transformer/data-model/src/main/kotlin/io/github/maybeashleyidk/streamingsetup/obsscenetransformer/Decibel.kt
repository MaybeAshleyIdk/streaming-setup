package io.github.maybeashleyidk.streamingsetup.obsscenetransformer

@JvmInline
public value class Decibel(public val value: Float) {

	override fun toString(): String {
		return "${this.value} dB"
	}
}

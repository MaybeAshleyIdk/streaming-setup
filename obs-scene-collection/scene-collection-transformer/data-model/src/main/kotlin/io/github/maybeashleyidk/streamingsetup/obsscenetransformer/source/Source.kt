package io.github.maybeashleyidk.streamingsetup.obsscenetransformer.source

public sealed class SourceProperties

public data class Source(
	public val properties: SourceProperties,
	public val filters: Map<String, Filter>,
) : SourceOrScene

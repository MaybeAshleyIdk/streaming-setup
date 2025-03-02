package io.github.maybeashleyidk.streamingsetup.obsscenetransformer.config

public data class Config(
	public val scenes: Map<String, Scene>
)

public data class Scene(
	public val name: String,
)

public data class Filter

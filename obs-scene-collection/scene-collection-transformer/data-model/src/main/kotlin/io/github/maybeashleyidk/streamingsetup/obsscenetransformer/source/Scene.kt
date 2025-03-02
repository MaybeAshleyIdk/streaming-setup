package io.github.maybeashleyidk.streamingsetup.obsscenetransformer.source

import io.github.maybeashleyidk.streamingsetup.obsscenetransformer.Transform

internal data class Scene(
	val sources: List<SceneSource>,
	val filters: Map<String, Filter>,
) : SourceOrScene

internal data class SceneSource(
	val sourceOrGroup: SourceOrGroupOrScene,
	val transform: Transform,
)

package io.github.maybeashleyidk.streamingsetup.obsscenetransformer.source

import io.github.maybeashleyidk.streamingsetup.obsscenetransformer.Transform

public data class Group(
	public val sources: List<GroupSource>,
	public val filters: Map<String, Filter>,
) : SourceOrGroupOrScene

public data class GroupSource(
	public val sourceOrScene: SourceOrScene,
	public val transform: Transform,
)

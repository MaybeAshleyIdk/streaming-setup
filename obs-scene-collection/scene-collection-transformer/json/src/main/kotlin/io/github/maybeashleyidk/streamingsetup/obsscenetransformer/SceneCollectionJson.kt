package io.github.maybeashleyidk.streamingsetup.obsscenetransformer

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class SceneCollectionJson(
	@SerialName("current_scene") val currentScene: String,
	@SerialName("current_program_scene") val currentProgramScene: String,
	@SerialName("scene_order") val sceneOrder: List<SceneNameWrapperJson>,
	@SerialName("name") val name: String,
	@SerialName("groups") val groups: List<GroupJson>,
	@SerialName("quick_transitions") val quickTransitions: List<QuickTransitionJson>,
	@SerialName("transitions") val transitions: List<Nothing>,
	@SerialName("saved_projectors") val savedProjectors: List<Nothing>,
	@SerialName("current_transition") val currentTransition: String,
	@SerialName("transition_duration") val transitionDuration: Int,
	@SerialName("preview_locked") val previewLocked: Boolean,
	@SerialName("scaling_enabled") val scalingEnabled: Boolean,
	@SerialName("scaling_level") val scalingLevel: Int,
	@SerialName("scaling_off_x") val scalingOffX: Double,
	@SerialName("scaling_off_y") val scalingOffY: Double,
	@SerialName("modules") val modules: ModulesJson,
	@SerialName("version") val version: Int,
	@SerialName("sources") val sources: List<SourceJson>,
)

@Serializable
public data class SceneNameWrapperJson(
	@SerialName("name") val name: String,
)

@Serializable
public data class GroupJson(
	val dummy: Nothing,
)

@Serializable
public data class QuickTransitionJson(
	@SerialName("name") val name: String,
	@SerialName("duration") val duration: Int,
	@SerialName("hotkeys") val hotkeys: List<Nothing>,
	@SerialName("id") val id: Int,
	@SerialName("fade_to_black") val fadeToBlack: Boolean,
)

@Serializable
public data class ModulesJson(
	@SerialName("scripts-tool") val scriptsTool: List<Nothing>,
	@SerialName("output-timer") val outputTimer: OutputTimerJson,
)

@Serializable
public data class OutputTimerJson(
	@SerialName("streamTimerHours") val streamTimerHours: Int,
	@SerialName("streamTimerMinutes") val streamTimerMinutes: Int,
	@SerialName("streamTimerSeconds") val streamTimerSeconds: Int,
	@SerialName("recordTimerHours") val recordTimerHours: Int,
	@SerialName("recordTimerMinutes") val recordTimerMinutes: Int,
	@SerialName("recordTimerSeconds") val recordTimerSeconds: Int,
	@SerialName("autoStartStreamTimer") val autoStartStreamTimer: Boolean,
	@SerialName("autoStartRecordTimer") val autoStartRecordTimer: Boolean,
	@SerialName("pauseRecordTimer") val pauseRecordTimer: Boolean,
)

@Serializable
public data class SourceJson(
	val dummy: Nothing,
	val settings: Map<String, Any>,
)

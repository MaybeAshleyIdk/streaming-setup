#!/usr/bin/make -f

SHELL = /bin/sh

JAVA ?= java

# <https://www.gnu.org/software/make/manual/html_node/Phony-Targets.html>
override scene_names := break ending starting

override scene_directory_pathnames := $(scene_names:%=scenes/%)
override scene_collection_json_file_pathname := Streaming.json

override scene_collection_transformer_gradlew := ./scene-collection-transformer/gradlew --project-dir=./scene-collection-transformer/

.SUFFIXES:

all: $(scene_directory_pathnames) $(scene_collection_json_file_pathname)


$(scene_directory_pathnames):
	$(MAKE) -C $@/ all

$(scene_collection_json_file_pathname): scene-collection.cfg
	$(scene_collection_transformer_gradlew) :main:shadowJar
	$(JAVA) -jar ./scene-collection-transformer/main/build/libs/main-all.jar $< $@


clean: $(scene_directory_pathnames:%=clean/%)
	rm -f -- $(scene_collection_json_file_pathname)

	$(scene_collection_transformer_gradlew) clean

$(scene_directory_pathnames:%=clean/%):
	$(MAKE) -C $(@:clean/%=%)/ clean


.PHONY: all $(scene_directory_pathnames) \
        clean $(scene_directory_pathnames:%=clean/%)

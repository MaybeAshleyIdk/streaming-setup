#!/usr/bin/make -f

SHELL = /bin/sh

# <https://www.gnu.org/software/make/manual/html_node/Phony-Targets.html>
override scene_directory_pathnames := starting placeholder ending

.SUFFIXES:

all: $(scene_directory_pathnames)
$(scene_directory_pathnames):
	$(MAKE) -C $@/ all

clean: $(scene_directory_pathnames:%=clean/%)
$(scene_directory_pathnames:%=clean/%):
	$(MAKE) -C $(@:clean/%=%)/ clean

.PHONY: all $(scene_directory_pathnames) \
        clean $(scene_directory_pathnames:%=clean/%)

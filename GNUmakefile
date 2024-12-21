#!/usr/bin/make -f

SHELL = /bin/sh

# <https://www.gnu.org/software/make/manual/html_node/Phony-Targets.html>
override subdirectory_pathnames := alerts chatbox background-music obs-scene-collection

.SUFFIXES:

all: $(subdirectory_pathnames)
$(subdirectory_pathnames):
	$(MAKE) -C $@/ all

clean: $(subdirectory_pathnames:%=clean/%)
$(subdirectory_pathnames:%=clean/%):
	$(MAKE) -C $(@:clean/%=%)/ clean

.PHONY: all $(subdirectory_pathnames) \
        clean $(subdirectory_pathnames:%=clean/%)

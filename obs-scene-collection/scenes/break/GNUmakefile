#!/usr/bin/make -f

SHELL = /bin/sh

# <https://www.gnu.org/software/make/manual/html_node/Phony-Targets.html>
override subscene_names := be-right-back doing-a-thing

override subscene_directory_pathnames := $(subscene_names)

.SUFFIXES:


all: $(subscene_directory_pathnames) secondary-text-image.png
$(subscene_directory_pathnames):
	$(MAKE) -C $@/ all


secondary-text-image.png: %.png: %.xcf
	../../../export-gimp-xcf $< $@


clean: $(subscene_directory_pathnames:%=clean/%)
	rm -f -- secondary-text-image.png

$(subscene_directory_pathnames:%=clean/%):
	$(MAKE) -C $(@:clean/%=%)/ clean


.PHONY: all $(subscene_directory_pathnames) \
        clean $(subscene_directory_pathnames:%=clean/%)

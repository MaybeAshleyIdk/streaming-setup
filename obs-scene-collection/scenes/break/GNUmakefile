#!/usr/bin/make -f

SHELL = /bin/sh

# <https://www.gnu.org/software/make/manual/html_node/Phony-Targets.html>
override subscene_names := be-right-back doing-a-thing

override subscene_directory_pathnames := $(subscene_names)

override text_image_name := secondary-text-image.png

.SUFFIXES:


all: $(subscene_directory_pathnames) $(text_image_name)
$(subscene_directory_pathnames):
	$(MAKE) -C $@/ all


$(text_image_name): secondary-text-image.xcf
	../../../export-gimp-xcf $< $@


clean: $(subscene_directory_pathnames:%=clean/%)
	rm -f -- $(text_image_name)

$(subscene_directory_pathnames:%=clean/%):
	$(MAKE) -C $(@:clean/%=%)/ clean


.PHONY: all $(subscene_directory_pathnames) \
        clean $(subscene_directory_pathnames:%=clean/%)

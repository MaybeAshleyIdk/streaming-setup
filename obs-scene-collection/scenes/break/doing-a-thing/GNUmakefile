#!/usr/bin/make -f

SHELL = /bin/sh

.SUFFIXES:

override text_image_name := primary-text-image.png

all: $(text_image_name)

$(text_image_name): primary-text-image.xcf
	../../../../export-gimp-xcf $< $@

clean:
	rm -f -- $(text_image_name)

.PHONY: all clean

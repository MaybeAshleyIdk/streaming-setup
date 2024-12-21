#!/usr/bin/make -f

SHELL = /bin/sh

.SUFFIXES:

all: text-image.png

text-image.png: %.png: %.xcf
	../../../gimp-export-png $< $@

clean:
	rm -f -- text-image.png

.PHONY: all clean

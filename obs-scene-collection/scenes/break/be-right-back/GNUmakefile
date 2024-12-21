#!/usr/bin/make -f

SHELL = /bin/sh

.SUFFIXES:

all: primary-text-image.png

primary-text-image.png: %.png: %.xcf
	../../../../gimp-export-png $< $@

clean:
	rm -f -- primary-text-image.png

.PHONY: all clean

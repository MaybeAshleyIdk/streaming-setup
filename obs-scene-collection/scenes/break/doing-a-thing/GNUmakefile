#!/usr/bin/make -f

SHELL = /bin/sh

.SUFFIXES:

all: primary-text-image.png

primary-text-image.png: %.png: %.xcf
	../../../../export-gimp-xcf $< $@

clean:
	rm -f -- primary-text-image.png

.PHONY: all clean

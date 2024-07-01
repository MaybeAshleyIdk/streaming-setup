#!/usr/bin/make -f

SHELL = /bin/sh

.SUFFIXES:

all: text-images/primary.png text-images/secondary.png

text-images/primary.png text-images/secondary.png: %.png: %.xcf
	../../gimp-export-png $< $@

clean:
	rm -f -- text-images/secondary.png text-images/primary.png

.PHONY: all clean

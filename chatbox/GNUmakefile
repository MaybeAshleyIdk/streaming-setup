#!/usr/bin/make -f

SHELL = /bin/sh

SASS ?= sass
SASSFLAGS = --style=compressed
override sass := $(SASS) $(SASSFLAGS) --no-indented --no-source-map

.SUFFIXES:

all: chatbox.css

watch:
	$(sass) --watch chatbox.scss chatbox.css

chatbox.css: _black-text-outline.scss chatbox.scss
	$(sass) $(lastword $^) $@

clean:
	rm -f -- chatbox.css

.PHONY: all clean

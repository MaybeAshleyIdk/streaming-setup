#!/usr/bin/make -f

SHELL = /bin/sh

SASS ?= sass
SASSFLAGS = --style=compressed
override sass := $(SASS) $(SASSFLAGS) --no-indented --load-path=_partials/ --no-source-map

override alert_directory_pathnames := channel-points/hydration \
                                      channel-points/metal-pipe-sfx \
                                      channel-points/tts \
                                      cheering \
                                      follows \
                                      gifted-subscriptions/community-multiple \
                                      gifted-subscriptions/community-multiple-anonymous \
                                      gifted-subscriptions/community-single \
                                      gifted-subscriptions/community-single-anonymous \
                                      gifted-subscriptions/individual \
                                      gifted-subscriptions/individual-anonymous \
                                      raids \
                                      subscriptions
override css_file_pathnames := $(alert_directory_pathnames:%=%/alert.css)

.SUFFIXES:

all: $(css_file_pathnames)

watch:
	$(sass) --watch $(foreach css_file_pathname,$(css_file_pathnames),$(css_file_pathname:%.css=%.scss):$(css_file_pathname))

$(css_file_pathnames): %.css: _partials/_base.scss _partials/_colors.scss %.scss
	$(sass) $(lastword $^) $@

clean:
	rm -f -- $(css_file_pathnames)

.PHONY: all clean

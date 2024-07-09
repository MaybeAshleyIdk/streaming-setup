#!/usr/bin/make -f

SHELL = /bin/sh

SASSC ?= sassc
SASSCFLAGS = --style compressed
override sassc := $(SASSC) $(SASSCFLAGS)

override alert_directory_pathnames := channel-points/hydration \
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

%.css: %.scss
	$(sassc) $< $@

clean:
	rm -f -- $(css_file_pathnames)

.PHONY: all clean

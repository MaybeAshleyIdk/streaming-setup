#!/usr/bin/make -f

SHELL = /bin/sh

.SUFFIXES:

all:
	$(MAKE) -C background-music/ all
	$(MAKE) -C scenes/ all

clean:
	$(MAKE) -C scenes/ clean
	$(MAKE) -C background-music/ clean

.PHONY: all clean

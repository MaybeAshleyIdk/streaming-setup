#!/usr/bin/make -f

SHELL = /bin/sh

.SUFFIXES:

all:
	$(MAKE) -C starting/ all
	$(MAKE) -C placeholder/ all
	$(MAKE) -C ending/ all

clean:
	$(MAKE) -C ending/ clean
	$(MAKE) -C placeholder/ clean
	$(MAKE) -C starting/ clean

.PHONY: all clean

#!/usr/bin/make -f

SHELL = /bin/sh

.SUFFIXES:

override albums := $(strip sources/home-before_the_night.zip \
                           sources/home-falling_into_place.zip \
                           sources/home-odyssey.zip)

all: playlist.m3u8

playlist.m3u8: $(albums)
	for album_zip_file_pathname in $^; do \
		unzip -o -d tracks/ "$$album_zip_file_pathname"; \
	done

	rm -f -- tracks/cover.*

	for track_file_pathname in tracks/*.flac; do \
		ffmpeg -i "$$track_file_pathname" "$${track_file_pathname%.flac}.opus" && \
			rm -- "$$track_file_pathname"; \
	done

	printf '' > $@

	cwd_pathname="$$(pwd -L)"; \
	for track_file_pathname in tracks/*.opus; do \
		printf 'file://%s/%s\n' "$$cwd_pathname" "$$track_file_pathname" >> $@; \
	done

clean:
	rm -rf -- playlist.m3u8 tracks/

.PHONY: all clean

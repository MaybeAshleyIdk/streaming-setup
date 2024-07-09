#!/usr/bin/make -f

SHELL = /bin/sh

.SUFFIXES:

override album_archive_file_pathnames != find album_archives \
                                              -exec $(SHELL) -c 'printf %s "$$0" | grep -Eq "^album_archives/[^/]+\\.zip\$$"' {} \; \
                                              -type f \
                                              -print

override album_directory_pathnames := $(album_archive_file_pathnames:album_archives/%.zip=albums/%)

all: playlist.m3u8

$(album_directory_pathnames): albums/%: album_archives/%.zip
	mkdir -p -- $@

	unzip -o -d $@/ $<
	rm -f -- $@/cover.*

	for track_file_pathname in $@/*.flac; do \
		ffmpeg -i "$$track_file_pathname" "$${track_file_pathname%.flac}.opus" && \
			rm -- "$$track_file_pathname"; \
	done

playlist.m3u8: $(album_directory_pathnames)
	true > $@

	cwd_pathname="$$(pwd -L)"; \
	for track_file_pathname in $(^:%=%/*.opus); do \
		printf 'file://%s/%s\n' "$$cwd_pathname" "$$track_file_pathname" >> $@; \
	done

clean:
	rm -rf -- playlist.m3u8 albums/

.PHONY: all clean

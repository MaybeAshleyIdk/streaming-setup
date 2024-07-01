# <https://stackoverflow.com/a/20814599/9581962>

import gimpfu

def _export_xcf_as_png(xcf_filename, png_filename):
    image = pdb.gimp_file_load(xcf_filename, xcf_filename)
    merged_layer = pdb.gimp_image_merge_visible_layers(image, 1)

    pdb.gimp_file_save(image, merged_layer, png_filename, png_filename)
    pdb.gimp_image_delete(image)

_export_xcf_as_png("{{FILENAME_XCF}}", "{{FILENAME_PNG}}")

pdb.gimp_quit(1)

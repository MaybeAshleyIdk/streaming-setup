; <https://testing.docs.gimp.org/3.0/en/gimp-scripting.html>

(define (export-xcf input-xfc-file-path output-file-path)
	(let*
		((
			; The procedure `gimp-file-load` returns a list apparently, so we take the first item with `car`
			image (car (gimp-file-load RUN-NONINTERACTIVE input-xfc-file-path))
		))

		(gimp-file-save RUN-NONINTERACTIVE image output-file-path ())

		(gimp-image-delete image)
	)
)

(export-xcf "{{INPUT_XCF_FILE_PATH}}" "{{OUTPUT_FILE_PATH}}")
(gimp-quit #f)

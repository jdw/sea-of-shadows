package com.github.jdw.seaofshadows.webgl.shared

import com.github.jdw.seaofshadows.webgl.shared.DOMString
import com.github.jdw.seaofshadows.webgl.shared.GLenum
import com.github.jdw.seaofshadows.webgl.shared.GLint

/**
 * hej
 */
interface WebGLActiveInfo {
	val size: GLint
	val type: GLenum
	val name: DOMString
	
}

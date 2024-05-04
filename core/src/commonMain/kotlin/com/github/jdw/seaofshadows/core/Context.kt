package com.github.jdw.seaofshadows.core

enum class Context(val mozillaApiSpecification: String, val javascriptName: String) {
    /**
     * Examples:
     * * val ctx = canvas.getContext("2d");
     * * val ctx = canvas.getContext(Context.CANVAS_2D);
     */
    CANVAS_2D("https://developer.mozilla.org/en-US/docs/Web/API/Canvas_API", "2d"),

    /**
     * Examples:
     * * val ctx = canvas.getContext("webgl");
     * * val ctx = canvas.getContext(Context.WEBGL1);
     */
    WEBGL1("https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API", "webgl"),

    /**
     * Examples:
     * * val ctx = canvas.getContext("webgl2");
     * * val ctx = canvas.getContext(Context.WEBGL2);
     */
    WEBGL2("https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API#webgl_2", "webgl2"),

    /**
     * Examples:
     * * val ctx = canvas.getContext("webgpu");
     * * val ctx = canvas.getContext(Context.WEBGPU);
     */
    WEBGPU("https://developer.mozilla.org/en-US/docs/Web/API/WebGPU_API", "webgpu")
}
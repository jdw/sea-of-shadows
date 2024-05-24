package com.github.jdw.seaofshadows.webgl.shared
//PROTECT_FROM_AUTODELETE

//class SequenceWebGLShader: List<WebGLShader> {
//    private val list: List<WebGLShader>
//    override val size: Int
//        get() {
//            return list.size
//        }
//
//
//    constructor(other: Collection<WebGLShader>) {
//        list = List<WebGLShader>(other.size) { idx: Int -> other.elementAt(idx) }
//    }
//
//
//    constructor(other: WebGLShader) {
//        list = listOf(other)
//    }
//
//
//    constructor(size: Int) {
//        list = List<WebGLShader>(size) { idx: Int -> this[idx] } //TODO Will this work?
//    }
//
//
//    override fun contains(element: WebGLShader): Boolean = list.contains(element)
//    override fun containsAll(elements: Collection<WebGLShader>): Boolean = list.containsAll(elements)
//    override fun get(index: Int): WebGLShader = list.get(index)
//    override fun isEmpty(): Boolean = list.isEmpty()
//    override fun iterator(): Iterator<WebGLShader> = list.iterator()
//    override fun listIterator(): ListIterator<WebGLShader> = list.listIterator()
//    override fun listIterator(index: Int): ListIterator<WebGLShader> = list.listIterator(index)
//    override fun subList(fromIndex: Int, toIndex: Int): List<WebGLShader> = list.subList(fromIndex, toIndex)
//    override fun lastIndexOf(element: WebGLShader): Int = list.lastIndexOf(element)
//    override fun indexOf(element: WebGLShader): Int = list.indexOf(element)
//}
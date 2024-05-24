package com.github.jdw.seaofshadows.webgl.shared
//PROTECT_FROM_AUTODELETE

class SequenceDomString : List<DOMString> {
    private val list: List<DOMString>
    override val size: Int
        get() {
            return list.size
        }


    constructor(other: Collection<DOMString>) {
        list = List<DOMString>(other.size) { idx: Int -> other.elementAt(idx) }
    }


    constructor(other: DOMString) {
        list = listOf(other)
    }


    constructor(size: Int) {
        list = List<DOMString>(size) { idx: Int -> this[idx] } //TODO Will this work?
    }


    override fun contains(element: DOMString): Boolean = list.contains(element)
    override fun containsAll(elements: Collection<DOMString>): Boolean = list.containsAll(elements)
    override fun get(index: Int): DOMString = list.get(index)
    override fun isEmpty(): Boolean = list.isEmpty()
    override fun iterator(): Iterator<DOMString> = list.iterator()
    override fun listIterator(): ListIterator<DOMString> = list.listIterator()
    override fun listIterator(index: Int): ListIterator<DOMString> = list.listIterator(index)
    override fun subList(fromIndex: Int, toIndex: Int): List<DOMString> = list.subList(fromIndex, toIndex)
    override fun lastIndexOf(element: DOMString): Int = list.lastIndexOf(element)
    override fun indexOf(element: DOMString): Int = list.indexOf(element)
}
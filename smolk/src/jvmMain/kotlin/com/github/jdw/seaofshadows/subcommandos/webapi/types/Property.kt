package com.github.jdw.seaofshadows.subcommandos.webapi.types

class Property(
    val name: String,
    val type: String,
    val mutable: Boolean,
    val defaultValue: String?,
    val const: Boolean
) {
    class Builder() {
        private var mutable: Boolean? = null
        private var name: String? = null
        private var type: String? = null
        private var defaultValue: String? = null
        private var const: Boolean? = null


        fun const(value: Boolean): Builder {
            const = value

            return this
        }


        fun defaultValue(value: String): Builder {
            defaultValue = value

            return this
        }


        fun mutable(value: Boolean): Builder {
            mutable = value

            return this
        }


        fun name(value: String): Builder {
            name = value

            return this
        }


        fun type(value: String): Builder {
            type = value

            return this
        }


        fun build(): Property {
            if (type!!.isEmpty()) throw Exception("Parameter type can not be empty!")
            if (name!!.isEmpty()) throw Exception("Parameter name can not be empty!")
            if (const!!) {
                if (mutable!!) throw IllegalStateException("A property can not be both mutable and 'const'!")
                if (null == defaultValue) throw IllegalStateException("A property can not be 'const' and not have a default value set!")
            }


            return Property(
                type = type!!,
                name = name!!,
                mutable = mutable!!,
                defaultValue = defaultValue,
                const = const!!)
        }
    }


    companion object {
        fun builder(): Builder {
            return Builder()
        }
    }
}
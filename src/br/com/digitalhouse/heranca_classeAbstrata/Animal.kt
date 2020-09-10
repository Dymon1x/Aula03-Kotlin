package br.com.digitalhouse.heranca_classeAbstrata

abstract class Animal(open val idade: Int = 0, open val especie: String = "") {
    open fun locomover() {}

    fun idade() {
        println("O animal tem idade $idade e é da especie $especie")
    }

    abstract fun come(comida: String): String
}
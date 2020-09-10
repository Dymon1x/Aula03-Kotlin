package br.com.digitalhouse.heranca_classeAbstrata

class Gato: Felino() {
    override val cor: String = "Amarela"

    fun gatoAndando(){
        super.locomover()
        println("A cor é: $cor")
    }
}
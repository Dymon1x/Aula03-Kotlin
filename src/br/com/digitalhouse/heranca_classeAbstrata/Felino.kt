package br.com.digitalhouse.heranca_classeAbstrata

open class Felino(open val cor: String = ""): Animal(){

    final override fun locomover() { // qualquer filha a partir daqui nao pode sobrescrever, mas pode ser utilizado por uma Class Gato
        for (passos in 0..2) {
            println("O felino está se locomovendo com a cor: $cor")
        }
    }

    override fun come(comida: String): String {
        return comida
    }
}
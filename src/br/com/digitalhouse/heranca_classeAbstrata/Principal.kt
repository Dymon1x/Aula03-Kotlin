package br.com.digitalhouse.heranca_classeAbstrata

fun main(){
    println("OBJETO PESSOA --------------------------------------------------")
    val brasileiro = Pessoa(19,"Humana", "João")
    brasileiro.locomover()
    brasileiro.idadePessoa()

    println("OBJETO FELINO --------------------------------------------------")
    val pantera = Felino()
    pantera.locomover()

    println("OBJETO GATO ----------------------------------------------------")
    val gatinhoPelucia = Gato()
    gatinhoPelucia.gatoAndando()

}
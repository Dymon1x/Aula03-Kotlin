package br.com.digitalhouse.heranca_classeAbstrata.exerBanco

abstract class Conta(var saldo: Double){
    abstract fun saque(quantia: Double)
    abstract fun depositar(quantia: Double)
}
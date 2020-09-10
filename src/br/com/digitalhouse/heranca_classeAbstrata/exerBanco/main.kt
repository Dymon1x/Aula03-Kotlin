package br.com.digitalhouse.heranca_classeAbstrata.exerBanco

fun main(){
    var conta1 = ContaCC()
    var conta2 = ContaPP()

//    Saque e deposito em conta correnye
//    println("Saldo: ${conta1.saldo}")
//    conta1.saque(123.0)
//    conta1.depositar(20.0)
//    println("Saldo: ${conta1.saldo}")

//    Saque e deposito em conta poupança
    println("Saldo: ${conta2.saldo}")
//    conta2.saque(120.0) //transação negada
    conta2.saque(90.0)
    conta2.depositar(20.0)
    println("Saldo: ${conta2.saldo}")
    conta2.recolheJuros(1)



}
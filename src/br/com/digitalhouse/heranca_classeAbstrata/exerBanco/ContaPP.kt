package br.com.digitalhouse.heranca_classeAbstrata.exerBanco

class ContaPP : Conta(100.0) {
    override fun saque(quantia: Double) {
        if ((quantia >= 0.0) && (saldo >= quantia)) {
            saldo -= quantia
            println("Transação aprovada - seu saldo: $saldo")
        } else {
            println("Transação negada")
        }
    }

    override fun depositar(quantia: Double) {
        if (quantia > 0.0) {
            saldo += quantia
            println("Deposito completo - saldo de $saldo")
        }
    }

    fun recolheJuros(mes: Int) {
        saldo *= (0.1 * mes)
        println("O seu juros é $saldo por mês")

    }
}
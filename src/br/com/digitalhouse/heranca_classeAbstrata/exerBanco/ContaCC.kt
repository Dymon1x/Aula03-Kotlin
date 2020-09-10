package br.com.digitalhouse.heranca_classeAbstrata.exerBanco

class ContaCC : Conta(100.0) {
    override fun saque(quantia: Double) {
        if (quantia >= 0.0) {
            saldo -= quantia
            println("Transação aprovada - seu saldo: $saldo")
        } else {
            saldo -= quantia
            println("Usei o cheque especial e meu saldo é $saldo")
        }
    }

    override fun depositar(quantia: Double) { //Depositar cheque
        if ((quantia > 0.0) && (saldo > 0.0)) {
            saldo += quantia
            println("Deposito completo em dinheiro de $quantia")
        } else if(saldo < 0.0){
            println("Deposito em cheque de $quantia")
            saldo += quantia
            var c = Cheque(300.0, "Santander", "30/10/2030")
        }
    }

}

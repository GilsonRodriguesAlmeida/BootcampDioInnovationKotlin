package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {

    val josefa = Analista("Josefa da Silva", "123-456-789.10", 6000.0)
    ImprimirRelatorioFuncionario.imprime(josefa)

}

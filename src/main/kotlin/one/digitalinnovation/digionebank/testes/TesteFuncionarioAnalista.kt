package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {

    val marcos = Analista("Marcos Vieira", "123-456-789.10", 1500.5)
    ImprimirRelatorioFuncionario.imprime(marcos)

}
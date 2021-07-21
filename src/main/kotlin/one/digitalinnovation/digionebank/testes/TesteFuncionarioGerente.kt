package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Gerente

fun main() {

    val josefa = Gerente("Josefa da Silva", "123-456-789.10", 6000.0, "senhA123")
    ImprimirRelatorioFuncionario.imprime(josefa)

    TesteAutenticacao().autentica(josefa)
}

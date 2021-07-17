package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val gil = Pessoa(nome = "Gilson Almeida", cpf = "123-456-789.10")
    println("Nome: " + gil.nome)
    println("Cpf: " + gil.cpf)

    println(" ")

    val marcos = Funcionario("Marcos Vieira", "123-456-789.10", BigDecimal.valueOf(1500.51))
    println("Nome: " + marcos.nome)
    println("Cpf: " + marcos.cpf)
    println("Salário: R$" + marcos.salario)
}
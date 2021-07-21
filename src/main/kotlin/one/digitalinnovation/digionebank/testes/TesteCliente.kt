package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo
import one.digitalinnovation.digionebank.Cliente

fun main() {
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "123.456.777-10",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(jose)
    TesteAutenticacao().autentica(jose)
}
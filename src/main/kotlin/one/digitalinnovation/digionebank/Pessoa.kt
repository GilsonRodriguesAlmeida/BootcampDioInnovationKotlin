package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Gilson Rodrigues de Almeida"

    var cpf: String = "051.202.689-10"
    private set

    constructor()

    fun infoDados() = "|Nome: $nome |Cpf: $cpf |"

}

fun main() {
    val gil = Pessoa()

    println(gil.infoDados())

}
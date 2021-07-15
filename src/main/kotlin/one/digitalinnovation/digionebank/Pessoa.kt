package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Gilson Rodrigues de Almeida"

    var cpf: String = "051.202.689-10"
    private set

}

fun main() {
    val gil = Pessoa()

    println(gil.nome)
    println(gil.cpf)

}
package one.digitalinnovation.digionebank

data class Banco(
    val nome: String,
    val numero: Int
) {
    fun infoDados() = "|Nome: $nome |nº $numero |"
}

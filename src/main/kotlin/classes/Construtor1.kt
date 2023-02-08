package classes

class Filme {
    val nome: String
    val anoLancamento: Int
    val genero: String

    constructor(nome: String, anoLancamento: Int, genero: String) {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}
fun main(args: Array<String>) {
    val filme = Filme("o poderoso chefão", 1982, "drama")
    println("O ${filme.genero} ${filme.nome} foi lancado em ${filme.anoLancamento}.")
}
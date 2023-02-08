package classes

class Filme2(val nome: String, val anoLancamento: Int, val genero: String)

fun main(args: Array<String>) {
    val filme = Filme2("monstros S.A", 2001, "comedia")
    println("A ${filme.genero} ${filme.nome} foi lancada em ${filme.anoLancamento}.")
}
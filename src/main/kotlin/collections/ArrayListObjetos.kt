package collections

data class Fruta (var nome: String, var preco: Double)

fun main(args: Array<String>) {
    var frutas = arrayListOf(Fruta("banana", 1.50), Fruta( "morango", 3.20))

    for (fruta in frutas){
        println("${fruta.nome} - R$ ${fruta.preco}")
    }
    println(frutas.contains(Fruta("banana", 1.50)))
    println(frutas.distinctBy { it.preco })
    frutas.add(Fruta("abacaxi", 3.50))
    println(frutas.contains(Fruta("abacaxi",3.50)))
}
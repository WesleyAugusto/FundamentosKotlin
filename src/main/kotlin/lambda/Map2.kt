package lambda

class Produto (val nome: String, val preco: Double)

val materialEscolar = listOf(
    Produto("Fichário Escolar", 21.90),
    Produto("Bolsa Escolar",  51.90),
    Produto("Lápis De Cor", 11.90),
    Produto("Borracha Bicolor", 0.70),
    Produto("Apontador Com Depósito", 1.80)
)

fun main(args: Array<String>) {
    val totalizar = {total: Double, atual: Double -> total + atual}
    val precoTotal = materialEscolar.map { it.preco }.reduce(totalizar)

    println("O preço médio é R$ ${precoTotal/ materialEscolar.size}.")


}
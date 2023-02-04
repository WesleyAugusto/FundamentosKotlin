package fundamentos.operadores
data class Carro (val  marca : String, val modelo: String)
fun main(args: Array<String>) {
    val (marca,modelo) = Carro ("ford", "fusion")
    println("$marca, $modelo")

    val (marido, mulher) = listOf("joao","maria")
    println("$marido, $mulher")

    val (_,_,terceiroLugar) = listOf("kimi", "hamilton", "alonso")
    println("$terceiroLugar terminou em terceiro lugar.")
}
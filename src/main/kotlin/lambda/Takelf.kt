package lambda

fun main(args: Array<String>) {
    println("Digite sua mensagem:")

    val entrada = readLine()
    val mensagem = entrada.takeIf { it?.trim() != "" } ?: "Sem Mensagem"

    println(mensagem)
}
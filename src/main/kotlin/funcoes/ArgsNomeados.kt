package funcoes

fun relacaoDeTrabalho (chefe:String, funcionario:String): String {
    return "$funcionario é subordinado(a) á $chefe."
}

fun main(args: Array<String>) {
    println(relacaoDeTrabalho("jão", "maria"))
    println(relacaoDeTrabalho(funcionario = "jao", chefe = "maria"))
}
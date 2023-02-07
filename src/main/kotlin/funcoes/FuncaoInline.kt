package funcoes

inline fun transacao(funcao: () -> Unit){
    println("abrindo transacao...")
    try {
        funcao()
    } finally {
        println("fechando transacao..")
    }
}

fun main(args: Array<String>) {
    transacao {
        println("execuntando SQL 1 ...")
        println("execuntando SQL 2 ...")
        println("execuntando SQL 3 ...")
    }
}
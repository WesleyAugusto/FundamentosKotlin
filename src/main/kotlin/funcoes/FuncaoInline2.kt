package funcoes

import fundamentos.soma

inline fun <T> executarComlog(nomeFuncao: String, funcao: ()-> T): T{
    println("entrando no metodo $nomeFuncao...")
    try {
        return funcao()
    }finally {
        println("metodo $nomeFuncao finalizado..")
    }
}
fun somar2(a: Int, b: Int): Int{
    return a + b
}

fun main(args: Array<String>) {
    val resultado = executarComlog("somar"){
        somar2(4 ,4)
    }
    println(resultado)
}
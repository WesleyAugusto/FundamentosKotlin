package fundamentos.controle

fun main(args: Array<String>) {
     val num1: Int = 4
    val num2: Int = 3

    val maiorvalor = if (num1 > num2){
        println("Processando...if")
        num1
    }else {
        println("processando...else")
        num2
    }
    println(" O maior valor é $maiorvalor.")
}
//exemplo 2[ val maiorvalor = if (num1 > num2) num1 else num2]
//         [ println("O maior valor é $maiorValor.") ]
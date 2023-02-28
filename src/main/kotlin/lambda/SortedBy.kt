package lambda

fun main(args: Array<String>) {
   val nomes = arrayListOf("Tixti", "Wesley","douglas", "gisele", "Amanda")
   val ordenados = nomes.sortedBy { it.reversed() }

    println(ordenados)
}
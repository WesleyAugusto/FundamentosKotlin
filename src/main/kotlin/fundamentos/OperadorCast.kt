package fundamentos

fun imprimirConceito(nota:Any){
    when (nota as Int){
        10 , 9 ->println("a")
        8 , 7 ->println("b")
        6 , 5 ->println("c")
        4 , 3 ->println("d")
        2 , 1 , 0 ->println("e")
        else -> println("Nota invalida")
    }
}
fun main(args: Array<String>) {
    val nota = arrayOf(9.6, 3.8, 7.2, 5.5, 4.1)
    for (nota in nota){
        imprimirConceito(nota.toInt())
    }
}
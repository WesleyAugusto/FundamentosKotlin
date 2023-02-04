package fundamentos.operadores

import java.util.Date

fun main(args: Array<String>) {
    println("banana" === "banana")
    println(3 != 2)
    println(3 > 2)
    println(3 < 2)
    println(3 <= 2)
    println(3 >= 2)

    val d1 = Date(0)
    val d2 = Date(0)

    // igualdade referencial
    println("resultado com '==='${d1 === d2}")

    // igualdade estrutural
    println("resultado com '=='${d1 == d2}")

}
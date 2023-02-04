package fundamentos

fun main(args: Array<String>) {
    val a = 1

    //numero para string
    println(a.toString()+ 1)

    //string para numero
    println("1.9".toDouble()+3)
    println("teste".toIntOrNull())
    println("teste".toIntOrNull() ?: 0)
    println("1".toInt()+ 3)
}
package funcoes

fun ordenar(vararg numeros: Int, a: Int): IntArray{
    println(a)
    return numeros.sortedArray()
}
fun main(args: Array<String>) {
    for (n in ordenar(6,5,3,2,1,4,56666,555, a = 1)){
        println("$n")
    }
}
package funcoes

fun imprimiMaior1 (a: Int, b: Int){
    println(Math.max(a,b))
}
fun imprimiMaior2 (a: Int, b:Int): Unit{
    println(Math.max(a,b))
}
fun imprimiMaior3 (a: Int, b:Int):Unit{
    println(Math.max(a,b))
    return
}
fun imprimiMaior4 (a: Int, b:Int): Unit{
    println(Math.max(a,b))
    return Unit
}
fun imprimiMaior5 (a: Int, b:Int){
    println(Math.max(a,b))
    return Unit
}
fun main(args: Array<String>) {
    imprimiMaior1(2, 1)
    imprimiMaior2(2, 1)
    imprimiMaior3(2, 1)
    imprimiMaior4(2, 1)
    imprimiMaior5(2, 1).run { 2 > 3 }.run { println("Resultado = $this") }
}

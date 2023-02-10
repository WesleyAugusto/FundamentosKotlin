package classes
//erro! kotlin Valor nao pode ser reatribuido( Val cannot be reassigned
//fun porReferencia(velocidade:Int){
//    velocidade++
//}

data class Carro (var marca: String, var modelo: String, var Velocidade: Int = 0)

fun porReferencia(carro: Carro){
    carro.Velocidade++
}
fun main(args: Array<String>) {
    var carro1 = Carro("ford", "Fusion")

    var carro2 = carro1
    carro2.modelo = "edge"
    println(carro1)

    carro1 = Carro("audi", "a4")

    porReferencia(carro1)
    porReferencia(carro2)

    println(carro1)
    println(carro2)

    var a = 1
    var b = a
    println(a === b)
    b++
    println(a === b)
    println(a)
    println(b)
}
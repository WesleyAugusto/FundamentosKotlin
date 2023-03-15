package lambda

data class Casa(var enderaco:String = "", var num: Int = 0)

fun main(args: Array<String>) {
    var casa = Casa()

    casa.run {
        enderaco = "Rua Jose Demarchi"
        num = 1234
    }
    println(casa)
}
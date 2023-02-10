package classes

class Cliente2 {
    constructor(nome: String){
        this.nome = nome
    }

    var nome:String
    get() = "Meu Nome é ${field}"
    set(value) {
        field = value.takeIf { value.isNotEmpty() } ?:"anonimo"
    }
}

fun main(args: Array<String>) {
    val c1 = Cliente2("")
    println(c1.nome)

    val c2 = Cliente2("pedro")
    c2.nome = "ana"
    println(c2.nome)
}
package classes

val diretmenteNoArquivo = "Bom Dia "

fun toplevel() {
    val local = "fulano!"
    println("$diretmenteNoArquivo $local")
}

class Coisa {
    var variavelDeInstancia: String = "Boa Noite"
    companion object {
        @JvmStatic
        val constanteDeClasse = "ciclano"
    }
    fun fazer() {
        val local: Int = 7

        if (local > 3) {
            val variavelDeBloco = "beltrano"
            println("$variavelDeInstancia, $constanteDeClasse, $local e $variavelDeBloco!")
        }

    }
}
fun main(args: Array<String>) {
    toplevel()
    Coisa().fazer()
    println(Coisa.constanteDeClasse)
}
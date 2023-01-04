package fundamentos

import fundamentos.pacoteA.simplesFuncao as funcaoSimples
import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.*

fun main() {
    kotlin.io.println(funcaoSimples("ok"))

    val coisa = Coisa ("Bola")
        println(coisa.nome)

    println(CARA)

    print("${soma(300,900)} ${subtracao(1000, 200)}")

}
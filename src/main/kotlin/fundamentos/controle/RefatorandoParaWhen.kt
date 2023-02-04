package fundamentos.controle

fun main(args: Array<String>) {
        val nota = 11

        when(nota){
            10,9 -> print("Fantastico")
            8,7 -> print("Parabens")
            6,5,4 -> print("Tem como Recuperar")
            in 0..3-> print("Te vejo no proximo semestre")

            else -> print("Nota invalida")
        }
}
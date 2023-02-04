package fundamentos.controle

fun main(args: Array<String>) {
    val alunos = arrayListOf("andre","carla","matheus")
    for ((indice, aluno)in alunos.withIndex()){
        println("${indice +1}- $aluno")
    }
}
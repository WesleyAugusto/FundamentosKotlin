package lambda

data class Aluno (val nome: String, val nota: Double)

fun main(args: Array<String>) {
    val alunos = arrayListOf(
        Aluno ("pedro", 7.5),
        Aluno ("matheus", 5.6),
        Aluno ("joice",6.9),
        Aluno ("otavio",7.1),
        Aluno ("augusto" ,7.2)
    )
    val aprovados = alunos.filter { it.nota >= 6.0 }.sortedBy { it.nome }
    println(aprovados)
}
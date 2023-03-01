package lambda

fun main(args: Array<String>) {
    val alunos = arrayListOf("Pedro", "Wesley", "Jonas")
    alunos.map { it.toUpperCase() }.apply { print(this) }
}
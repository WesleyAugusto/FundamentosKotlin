package collections

fun main(args: Array<String>) {
    val aprovados = hashSetOf("joao", "maria", "pedro", "ana", "joana")
    //aprovados.add(1)

    println("Sem Ordem...")
    for (aprovado in aprovados){
        aprovado.print()
    }

    val aprovadosNaOrdem1 = linkedSetOf("joao", "maria", "pedro", "ana", "joana")

    println("\nSorted..")
    for (aprovado in aprovadosNaOrdem1){
        aprovado.print()
    }

    //Ordem maluca...
    aprovados.sortedBy { it.substring(1) }.print()
}
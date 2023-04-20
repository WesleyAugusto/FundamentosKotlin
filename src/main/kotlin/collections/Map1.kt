package collections

fun main(args: Array<String>) {
    val map = HashMap<Long, String>()

    map.put(10020030040, "jao")
    map.put(10050030040, "pedro")
    map.put(10070030040, "maria")

    map.put(10080030040, "pedro filho")

    for (par in map){
        println(par)
    }
    for (nome in map.values){
        println(nome)
    }
    for (cpf in map.keys){
        println(cpf)
    }
    for ((cpf, nome) in map){
        println("$nome (CPF: $cpf")
    }
    map.size.print()
    map.get(10080030040)?.print()
    map[10080030040]?.print()
    map.contains(10080030040).print()
    map.remove(10080030040)?.print()
    map.clear()
    map.isEmpty().print()
}
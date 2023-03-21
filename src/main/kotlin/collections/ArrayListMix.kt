package collections

fun main(args: Array<String>) {
    val listmix = arrayListOf("rafael", 1,true, 3.14,'p')

    for (item in listmix){
        if (item is String){
            println(item.toUpperCase())
        }else {
            println(item)
        }
    }
}
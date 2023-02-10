package classes

enum class DiaSemana2(val id:Int, val nome:String, val util:Boolean){
    DOMINGO(1,"Domingo", false),
    SEGUNDA(2,"Segunda", true),
    TERCA(3, "terca", true),
    QUARTA(4,"quarta", true),
    QUINTA(5,"quinta", true),
    SEXTA(6,"sexta", true),
    SABADO(7,"sabado", false),
}

fun main(args: Array<String>) {
    for (dia in DiaSemana2.values()){
        println("${dia.nome} é um dia ${if(dia.util) "util" else "do fim de semana"}.")
    }
}
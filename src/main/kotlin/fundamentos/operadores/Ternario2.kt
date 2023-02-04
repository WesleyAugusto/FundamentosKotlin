package fundamentos.operadores

fun obterResult(nota:Double):String = if (nota >= 7.0)"Passou" else "Reprovou"

fun main(args: Array<String>) {
    print(obterResult(7.0))
}
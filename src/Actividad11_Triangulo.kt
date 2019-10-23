fun main(args: Array<String>) {
    println("Indiqueme la altura de la piramide : ")
    val n= readLine()!!.toInt()

    for (fila in 1..n) {
        /* Espacios en blanco*/
        for (col in 1..n - fila) {
            print(" ")
        }

        for (col in 1..2 * fila - 1) {
            print("*")
        }
        println()
    }
}

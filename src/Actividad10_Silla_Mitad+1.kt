fun main (parametro: Array<String>) {
    println("Indiqueme la altura de la silla : ")
    val n= readLine()!!.toInt()
    val m:Int
    m = n / 2 + 1
    for (col in 1..n) {
        if (col < m) {
            println("*")
        } else if (col == m) {
            for (i in 0 until m) {
                print("*")
            }
            println()
        } else {
            for (i in 0 until m) {
                if (i == 0 || i == m - 1) {
                    print("*")
                } else {
                    print(" ")
                }
            }
            println()
        }
    }
}

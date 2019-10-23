//Actividad 4
//Cree un programa que a partir de un entero calcule su serie Fibonacci
fun main(arg: Array<String>) {
    var numVal: Long
    var fib = 0L
    var aux = 1L
//    var num: Int
    print("Ingrese un numero para la sucesion de fibonacci: ")
    numVal = readLine()!!.toLong()
//    print("Ingrese un numero entero para la sucesion de fibonacci: ")
//    num = readLine()!!.toInt()
    if (numVal > 0) {
        (1..numVal).forEach {
            print("[$fib] ")
            aux += fib
            fib = aux - fib
        }
    } else {
        println("El numero debe ser mayor a cero!!")
    }

  /*  fun fibonacci(numVal: Int): Int {
        var array = intArrayOf(0, 1)
        for (i in 2 until numVal+1) {
            array+=(array[i - 2] + array[i - 1])
        }
        return array[numVal]
    }
    fibonacci(numVal);*/
}

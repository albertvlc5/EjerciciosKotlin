//Actividad 2
//Realizar un programa que no pida un unidad en kb y nos haga la conversión a MB
fun main() {
    println("Introduzca el numero de KB :")
    var input: Double = readLine()!!.toDouble()

    var res: Double = input / 8
    var res2: Double = res/ 1024
    println("La equivalencia de $input K son $res2 MB"  )
}
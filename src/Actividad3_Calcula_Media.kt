//Actividad 3
//Escriba un programa que calcule la media de N numéro enteros introducidos.

fun main() {
    println("Cuantos numeros desea sumar:")
    var inputNumeros :Int= readLine()!!.toInt()

    var suma: Int = 0
    var media: Double = 0.0
    var i : Int = 1


    for ( i in 1 ..inputNumeros) {
        println("Introduzca el valor del numero a sumar:")
        var num :Int= readLine()!!.toInt()
        suma=suma+num
    }
    media= suma.toDouble() / inputNumeros
    println("La media es $media")


}
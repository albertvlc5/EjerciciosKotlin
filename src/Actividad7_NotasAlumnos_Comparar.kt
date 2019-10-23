fun main(args: Array<String>) {
    var arrayNotas = arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
    var cont1: Int = 0
    var cont2: Int = 0

    for (i in 0..9) {
        print("Introduzca la nota del alumno $i :")
        var inputNotas: Int = readLine()!!.toInt()
        arrayNotas[i] = inputNotas
        if (arrayNotas[i] >= 7) {
            cont1 += 1
        }else{
            cont2 += 1;
        }
    }
    println("Las notas mayores de 7 en clase son $cont1 ")
    println("Las notas menores de 7 en clase son $cont2 ")
}



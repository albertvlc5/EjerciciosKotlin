//Realizar la carga de la cantidad de hijos de 10 familias. Contar cuantos tienen 0,1,2 o más hijos. Imprimir dichos contadores.
fun main(args: Array<String>) {

    val miLista:MutableList<Int> = mutableListOf()
    for (i in 0..9) {
        print("Introduce el numero de hijos de la familia $i :")
        val nuevoValor = readLine()!!.toInt()
        miLista.add(nuevoValor)
    }

    var cont1:Int = 0
    var cont2:Int=0
    var cont3:Int=0

    for (i in 0 .. 9) {
        print(" $i --> ")
        println(miLista[i])
        if(miLista[i]==1) { cont1 +=1 }
        else if (miLista[i]==2) {cont2 +=1 }
        else if (miLista[i] >2) {cont3 +=1 }
    }

    println("Tienen un hijo $cont1 familias")
    println("Tienen dos hijos $cont2 familias")
    println("Tienen mas de dos hijos $cont3 familias")

//    //val arr = IntArray(10) { 1; 4;6;15;21;45;67;57;84;4;6;21}
//
//    var arrayEnteros = arrayOf(1,4,6,15,2,21,45,2,57,84,2,2,1)
//    var cont1:Int = 0
//    var cont2:Int=0
//    var cont3:Int=0
//
//    for (i in 0 .. 12) {
//        print(" $i --> ")
//        println(arrayEnteros[i])
//        if(arrayEnteros[i]==1) { cont1 +=1 }
//        else if (arrayEnteros[i]==2) {cont2 +=1 }
//        else if (arrayEnteros[i] >2) {cont3 +=1 }
//    }
//
//    println("Tienen un hijo $cont1 familias")
//    println("Tienen dos hijos $cont2 familias")
//    println("Tienen mas de dos hijos $cont3 familias")

}




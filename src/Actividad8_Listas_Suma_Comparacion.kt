fun main (parametro: Array<String>) {
    /*var lista1 = listOf<Int>(5, 10, 15, 20, 25);
    var lista2 = listOf<Int>(3, 6, 9, 12, 15);*/
    val lista1:MutableList<Int> = mutableListOf()
    for (i in 0..4) {
        print("Introduzca el elemento $i de la Lista1 : ")
        val nuevoValor = readLine()!!.toInt()
        lista1.add(nuevoValor)
    }
    val lista2:MutableList<Int> = mutableListOf()
    for (i in 0..4) {
        print("Introduzca el elemento $i de la Lista2 : ")
        val nuevoValor = readLine()!!.toInt()
        lista2.add(nuevoValor)
    }
    var sum1: Int = 0;
    var sum2: Int = 0;
    for (i in 0..4) {
        sum1 += lista1[i]
        sum2 += lista2[i]
    }
    if(sum1>sum2){
        println("La lista1 es mayor, ya que la suma de sus elementos es: $sum1 y la de la Lista2 es: $sum2 .");
    } else if (sum2>sum1) {
        println("La lista 2 es mayor, ya que la suma de sus elementos es: $sum2 y la de la Lista1 es: $sum1 .");
    }else{
        println("Las listas son iguales")
    }
}
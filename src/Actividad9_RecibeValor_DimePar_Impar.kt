fun main (parametro: Array<String>) {


    println("Cuantos numeros enteros quieres cargar: ")
    var n= readLine()!!.toInt()
    var lista2 : MutableList<Int> = mutableListOf(n)
    for ( i in 0 until n) {
        println("Numero a cargar: ")
        var ncargado= readLine()!!.toInt()
        lista2.add(ncargado)
    }
    var contpar: Int = 0
    var contimpar: Int=0
    for (i in 1..lista2.size-1) if(lista2[i]%2==0) contpar +=1
    else
        contimpar +=1
    println(message = "Tengo $contpar pares  y $contimpar impares")


   /* var lista1 = listOf<Int>(2,3,5,6,7,8,9,22,11)
//    lista1.append(1)
    var contpar: Int = 0
    var contimpar: Int=0
    for (i in 0..8) if(lista1[i]%2==0) contpar +=1
    else
        contimpar +=1
    println(message = "Tengo $contpar pares  y $contimpar impares")*/
}

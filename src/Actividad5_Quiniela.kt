//Actividad 5
//Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14 partidos y el pleno al quince (15 filas)
fun main(args: Array<String>) {
    for (i in 1 .. 15) {
        for (k in 1..3){
            for(j in 1 .. 3){
                when (j){
                    1 -> print("[1]")
                    2 -> print("[x]")
                    3 -> print("[2]")

                }

            }
            print("  ")
        }
        println("")
    }
}
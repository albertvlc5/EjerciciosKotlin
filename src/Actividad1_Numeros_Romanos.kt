//Actividad 1
//Escriba un método que imprima la representación de su parámetro entero en números romanos.
// Por ejemplo, si el parámetro es 1998, la salida debe ser MCMXCVIII

fun main() {
    println("Introduzca un numero:")
    var input :Int= readLine()!!.toInt()

    IntegerToRomanNumeral(input)
}

fun IntegerToRomanNumeral(input: Int): String {
    var input = input
    if (input < 1 || input > 3999)
        return "Invalid Roman Number Value"
    var s = ""
    while (input >= 1000) {
        s += "M"
        input -= 1000
    }
    while (input >= 900) {
        s += "CM"
        input -= 900
    }
    while (input >= 500) {
        s += "D"
        input -= 500
    }
    while (input >= 400) {
        s += "CD"
        input -= 400
    }
    while (input >= 100) {
        s += "C"
        input -= 100
    }
    while (input >= 90) {
        s += "XC"
        input -= 90
    }
    while (input >= 50) {
        s += "L"
        input -= 50
    }
    while (input >= 40) {
        s += "XL"
        input -= 40
    }
    while (input >= 10) {
        s += "X"
        input -= 10
    }
    while (input >= 9) {
        s += "IX"
        input -= 9
    }
    while (input >= 5) {
        s += "V"
        input -= 5
    }
    while (input >= 4) {
        s += "IV"
        input -= 4
    }
    while (input >= 1) {
        s += "I"
        input -= 1
    }
    println(s)
    return s

}
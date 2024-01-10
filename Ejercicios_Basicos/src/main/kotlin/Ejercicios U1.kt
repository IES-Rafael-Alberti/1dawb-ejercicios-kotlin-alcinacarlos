fun u1Ejercicio4(){
    print("Ingresa la temperatura en grados Celsius: ")
    val temperaturaCelsius = readln().toDoubleOrNull()
   if (temperaturaCelsius != null){
       val fahrenheit = ((temperaturaCelsius * 9 / 5) + 32)
       println("%.2f grados Celsius son equivalentes a %.2f grados Fahrenheit.".format(temperaturaCelsius, fahrenheit))
   }else{
       println("Número no válido")
   }

}
fun u1Ejercicio6(){
    print("Ingrese el importe final del artículo: ")
    val importeFinal = readln().toDoubleOrNull()
    if (importeFinal != null && importeFinal >= 0) {
        val iva = importeFinal * 0.1
        val importeSinIVA = importeFinal - iva
        println("Importe sin IVA: %.2f".format(importeSinIVA))
        println("IVA pagado: %.2f".format(iva))
    } else {
        println("Importe no válido.")
    }
}

fun u1Ejercicio12(){
    var peso: Double? = null
    var altura: Int? = null
    var pesoOk = true
    var alturaOk = true
    do {
        print("Ingrese el peso; ")
        try {
            peso = readln().toDouble()
            pesoOk = false
        }
        catch (e:Exception){
            println("Peso no válido")
        }
    }while (pesoOk)
    do {
        print("Ingrese la altura en cm: ")
        try {
            altura = readln().toInt()
            alturaOk = false
        }
        catch (e:Exception){
            println("Altura no válida")
        }
    }while (alturaOk)

    val imc = peso?.div((altura?.times(altura)!!))
    println("Tu IMC es: $imc")

}
fun u1Ejercicio15(){
    print("Cantidad de dinero depositada en la cuenta de ahorros: ")
    var dinero = readln().toDoubleOrNull()
    if (dinero != null){
        for (i in 0..2){
            dinero *= (1 + 0.04)
            println("%.2f €11".format(dinero))
        }
    }
}
fun u1Ejercicio18(){

}
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
    println("Introduce tu nombre completo: ")
    val nombre = readln()
    println(nombre.lowercase())
    println(nombre.uppercase())
    println(nombre.capitalize())
}

fun u1Ejercicio20() {

    print("Ingrese un número de teléfono con el formato +34-XXXXXXXXX-XX: ")
    val telefono: String = readln()

    if (telefono.length == 16 && telefono.substring(0,4) == "+34-" && telefono.substring(4,13).toDoubleOrNull() != null && telefono[13] == '-' && telefono.substring(14).toDoubleOrNull() != null) {
        println("Número sin prefijo y extensión: ${telefono.substring(4, 13)}")

    } else {
        println("El formato del número no es válido.")
    }
}
fun u1Ejercicio21() {
    print("Ingrese una frase que quiera ver invertida: ")
    val frase: String = readln().reversed()
    println("La frase invertida es: ")
    print(frase)
}

fun u1Ejercicio22() {
    print("Introduzca una frase: ")
    val frase = readln()
    var todoOk = false
    var vocal: String
    do {
        print("Introduzca una vocal: ")
        vocal = readln().lowercase()
        if (vocal in setOf("a", "e", "i", "o", "u")) {
            todoOk = true
        } else {
            println("Error, no has introducido una vocal.")
        }
    } while (!todoOk)

    val fraseModificada = frase.replace(vocal, vocal.uppercase())
    println("La frase introducida con la vocal '$vocal' en mayúsculas es: $fraseModificada")
}


fun u1Ejercicio24() {
    print("Introduzca el precio de un producto en euros con dos decimales: ")
    val precio = readln().trim()
    try {
        val precioDecimal = precio.toDouble()
        val precioTruncado = String.format("%.2f", precioDecimal)
        val precioList = precioTruncado.split(".", ",")

        println("El precio introducido tiene ${precioList[0]} euros y ${precioList[1]} céntimos.")
    } catch (e: NumberFormatException) {
        println("Error, no ha introducido un número decimal.")
    }
}
fun u1Ejercicio26() {
    print("Introduzca los productos de su cesta de la compra, separados por comas: ")
    val compraLista = readln().trim().split(",")
    println("Los elementos de tu lista de la compra son:")
    for (elemento in compraLista) {
        println("- ${ elemento.trim().replaceFirstChar { it.uppercase() } }")
    }
}
fun u1Ejercicio27() {
    var productoPrecio: String
    var productoUnidades: String
    print("Introduzca el nombre de un producto: ")
    val productoNombre = readln().trim()
    do {
        print("Introduzca el precio del producto: ")
        productoPrecio = readln().trim()
    } while (productoPrecio.toDoubleOrNull() == null)
    do {
        print("Introduzca el número de unidades del producto: ")
        productoUnidades = readln().trim()
    } while (productoUnidades.toIntOrNull() == null)
    println("El pedido del producto $productoNombre con un precio por unidad de %.2f€ y un total de %d unidades costará %.2f€.".format(productoPrecio.toDouble(), productoUnidades.toInt(), (productoPrecio.toDouble() * productoUnidades.toInt())))
}
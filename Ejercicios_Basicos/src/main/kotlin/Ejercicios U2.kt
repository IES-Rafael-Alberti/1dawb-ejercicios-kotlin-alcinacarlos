fun u2EjercicioCon2() {
    val password = "contraseña"

    while (true) {
        print("Introduce la contraseña: ")
        val password2 = readLine() ?: ""

        if (password == password2) {
            println("Contraseña correcta")
            break
        } else {
            println("La contraseña es incorrecta")
        }
    }
}
fun u2EjercicioCon3() {
    println("Introduce un numero: ")
    val num1 = readLine()?.toIntOrNull()
    println("Introduce otro numero: ")
    val num2 = readLine()?.toIntOrNull()

    if (num1 == null || num2 == null) {
        println("Error: Entrada no válida.")
        return
    }

    if (num2 == 0) {
        println("Error: No se puede dividir por cero.")
    } else {
        println(num1.toDouble() / num2.toDouble())
    }
}

fun u2EjercicioCon6() {
    print("Ingresa tu nombre: ")
    var nombre = readLine() ?: ""
    nombre = nombre.uppercase()

    print("Ingresa tu sexo (H/M): ")
    val sexo = readLine() ?: ""

    val grupo = if ((sexo == "M" && nombre < "M") || (sexo == "H" && nombre >= "M")) {
        "A"
    } else {
        "B"
    }

    println("Tu nombre '$nombre' te ubica en el grupo $grupo.")
}

fun u2EjercicioCon8() {
    val inaceptable = 0.0
    val aceptable = 0.4
    val meritorio = 0.6
    val dinero = 2400.0

    print("Introduce tu puntuación obtenida: ")
    val puntos = readLine()?.toFloatOrNull() ?: run {
        println("Error: Entrada no válida.")
        return
    }

    val dineroTotal: Double = when {
        puntos.toDouble() == inaceptable -> dinero * inaceptable
        puntos.toDouble() == aceptable -> dinero * aceptable
        puntos >= meritorio -> dinero * puntos
        else -> {
            println("Puntuación errónea")
            return
        }
    }

    val nivel = when (puntos) {
        inaceptable.toFloat() -> "inaceptable"
        aceptable.toFloat() -> "aceptable"
        in meritorio..Double.POSITIVE_INFINITY -> "meritorio"
        else -> "desconocido"
    }

    println("Tu nivel de rendimiento es $nivel, ganas $dineroTotal")
}

fun u2EjercicioCon10() {
    var opcion: Int
    val fijos = "mozzarella y el tomate"

    while (true) {
        print("Elige una opción:\n 1. Vegetariano\n 2. No Vegetariano\n 3. Salir\n")
        opcion = readLine()?.toIntOrNull() ?: run {
            println("Error: Entrada no válida.")
            return
        }

        when (opcion) {
            1 -> {
                val tipoPizza = "vegetariana"
                print("Elige un ingrediente:\n 1. Pimiento\n 2. Tofu\n")
                val ingrediente = readLine()?.toIntOrNull() ?: run {
                    println("Error: Entrada no válida.")
                    return
                }

                val nombreIngrediente = when (ingrediente) {
                    1 -> "pimiento"
                    2 -> "Tofu"
                    else -> {
                        println("Error - Por favor, introduzca una opción disponible")
                        continue
                    }
                }

                println("Tu pizza $tipoPizza contiene $nombreIngrediente obviando la $fijos")
            }
            2 -> {
                val tipoPizza = "no vegetariana"
                print("Elige un ingrediente:\n 1. peperoni\n 2. jamón\n 3. salmón\n")
                val ingrediente = readLine()?.toIntOrNull() ?: run {
                    println("Error: Entrada no válida.")
                    return
                }

                val nombreIngrediente = when (ingrediente) {
                    1 -> "peperoni"
                    2 -> "jamón"
                    3 -> "salmón"
                    else -> {
                        println("Error - Por favor, introduzca una opción disponible")
                        continue
                    }
                }

                println("Tu pizza $tipoPizza contiene $nombreIngrediente obviando la $fijos")
            }
            3 -> break
            else -> {
                println("Error - Por favor, introduzca una opción disponible")
                continue
            }
        }
    }
}

fun u2EjercicioIte2 {
    print("Introduce tu edad: ")
    val edad = readLine()?.toIntOrNull() ?: run {
        println("Error: Entrada no válida.")
        return
    }

    for (i in 0..edad) {
        print("$i ")
    }
}

fun u2EjercicioIte4() {
    print("Introduce un numero entero positivo: ")
    val num = readLine()?.toIntOrNull() ?: run {
        println("Error: Entrada no válida.")
        return
    }

    for (i in num downTo 0) {
        if (i == 0) {
            println(i)
        } else {
            print("$i, ")
        }
    }
}

fun u2EjercicioIte6() {
    print("Introduce un numero entero: ")
    val num = readLine()?.toIntOrNull() ?: run {
        println("Error: Entrada no válida.")
        return
    }

    val caracter = "*"

    for (i in 1..num) {
        println(caracter.repeat(i))
    }
}

fun u2EjercicioIte7() {
    print("Introduce un numero entero: ")
    val tabla = readLine()?.toIntOrNull() ?: run {
        println("Error: Entrada no válida.")
        return
    }

    for (i in 1..10) {
        val multiplicacion = tabla * i
        println("$tabla x $i = $multiplicacion")
    }
}

fun u2EjercicioIte8() {
    print("Introduce un numero entero: ")
    val num = readLine()?.toIntOrNull() ?: run {
        println("Error: Entrada no válida.")
        return
    }

    for (i in 0..num) {
        for (j in 2 * i - 1 downTo 0 step 2) {
            print("$j ")
        }
        println()
    }
}

fun u2EjercicioIte13() {
    while (true) {
        print("Introduce una palabra: ")
        val entrada = readLine() ?: ""
        println("Eco: $entrada")

        if (entrada == "salir" || entrada == "Salir") {
            break
        }
    }
}

fun sumatoriaPositivos(num: Int): Int {
    var cont = 0

    var numero = num
    while (numero != 0) {
        if (numero > 0) {
            cont += numero
        }
        print("Introduce otro numero: ")
        numero = readLine()?.toIntOrNull() ?: 0
        if (numero == 0) {
            break
        }
    }

    return cont
}

fun u2EjercicioIte15() {
    var total = 0
    while (true) {
        print("Introduce un numero: ")
        val num = readLine()?.toIntOrNull() ?: 0

        if (num < 0) {
            continue
        }

        total += sumatoriaPositivos(num)
        println(total)
        break
    }
}

fun u2EjercicioIte18() {
    var cont = 0
    while (true) {
        print("Introduce un número entero positivo: ")
        val num = readLine()?.toIntOrNull() ?: 0

        if (num == -1) {
            break
        }

        if (num < 0) {
            println("El número ingresado no es positivo.")
            continue
        }

        if (num % 2 == 0) {
            cont += 1
        }

        val suma = sumatoriaPositivos(num)
        println("Suma: $suma")
    }

    println("Cantidad de numeros pares: $cont")
}

fun u2EjercicioIte19() {
    while (true) {
        print("Menú:\n 1 - Comenzar programa\n 2 - Imprimir listado\n 3 - Finalizar programa\n")
        val opcion = readLine() ?: ""

        when (opcion) {
            "1" -> "Hola"
            "2" -> "Lista :D"
            "3" -> {
                println("Finalizando el programa.")
                return
            }
            else -> {
                println("Opción incorrecta. Por favor, elige una opción válida.")
            }
        }
    }
}

fun palabraMasLarga(frase: String): String {
    var palabra = ""
    var palabraLarga = ""
    var longPalabra = 0
    var longMax = 0

    for (letra in frase) {
        if (letra != ' ') {
            palabra += letra
            longPalabra++
        } else {
            if (longPalabra > longMax) {
                palabraLarga = palabra
                longMax = longPalabra
            }
            palabra = ""
            longPalabra = 0
        }
    }

    if (longPalabra > longMax) {
        palabraLarga = palabra
    }

    return palabraLarga
}

fun u2EjercicioIte25() {
    print("Ingresa una frase: ")
    val frase = readLine() ?: ""
    val palabraLarga = palabraMasLarga(frase)

    if (palabraLarga.isNotEmpty()) {
        println("La palabra más larga es: $palabraLarga")
    } else {
        println("No se ingresaron palabras.")
    }

    val palabras = frase.split(" ")
    val cantidadPalabras = palabras.size
    println("Cantidad de palabras en la frase: $cantidadPalabras")
}
fun u2EjercicioExc2() {
    try {
        print("Introduce un número entero positivo: ")
        val input = readLine() ?: throw IllegalArgumentException("Entrada nula")

        val numero = input.toIntOrNull() ?: throw NumberFormatException("Entrada no es un número entero")

        if (numero <= 0) {
            throw IllegalArgumentException("Por favor, introduce un número entero positivo.")
        }

        val impares = (1..numero).filter { it % 2 != 0 }

        println("Números impares desde 1 hasta $numero: ${impares.joinToString(", ")}")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}

fun u2EjercicioExc3() {
    var numero: Int

    while (true) {
        try {
            print("Introduce un número entero positivo: ")
            val input = readLine() ?: throw IllegalArgumentException("Entrada nula")

            numero = input.toIntOrNull() ?: throw NumberFormatException("Entrada no es un número entero")

            if (numero < 0) {
                throw IllegalArgumentException("Por favor, introduce un número entero positivo.")
            }

            break
        } catch (e: Exception) {
            println("Error: ${e.message}")
        }
    }

    val cuentaAtras = (numero downTo 0).joinToString(", ")
    println("Cuenta atrás desde $numero hasta 0: $cuentaAtras")
}

fun u2EjercicioExc4() {
    try {
        print("Introduce un número entero: ")
        val input = readLine() ?: throw IllegalArgumentException("Entrada nula")

        val numero = input.toIntOrNull() ?: throw NumberFormatException("Entrada no es un número entero")

        println("Número ingresado: $numero")
    } catch (e: Exception) {
        println("La entrada no es correcta. Error: ${e.message}")
    }
}
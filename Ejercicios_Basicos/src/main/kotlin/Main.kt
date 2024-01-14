fun main() {
    menuEj(elegirUnidad())
}
fun mostrarMenu() {
    println("1 - Ejercicios U1")
    println("2 - Ejercicios U2")
    println("3 - Ejercicios U3")
}
fun mostrarUnidad1() {
    println("Elige el ejercicio de la unidad 1: ")
    println("1 - Ejercicio 04")
    println("2 - Ejercicio 06")
    println("3 - Ejercicio 12")
    println("4 - Ejercicio 15")
    println("5 - Ejercicio 18")
    println("6 - Ejercicio 20")
    println("7 - Ejercicio 21")
    println("8 - Ejercicio 22")
    println("9 - Ejercicio 24")
    println("10 - Ejercicio 25")
    println("11 - Ejercicio 26")
    println("12 - Ejercicio 27")
}
fun mostrarUnidad2(){
    println("1 - Ejercicio Condicion 2")
    println("2 - Ejercicio Condicion 3")
    println("3 - Ejercicio Condicion 6")
    println("4 - Ejercicio Condicion 8")
    println("5 - Ejercicio Condicion 10")
    println("6 - Ejercicio Iterativa 2")
    println("7 - Ejercicio Iterativa 4")
    println("8 - Ejercicio Iterativa 6")
    println("9 - Ejercicio Iterativa 7")
    println("10 - Ejercicio Iterativa 8")
    println("11 - Ejercicio Iterativa 13")
    println("12 - Ejercicio Iterativa 15")
    println("13 - Ejercicio Iterativa 18")
    println("14 - Ejercicio Iterativa 19")
    println("15 - Ejercicio Iterativa 25")
    println("16 - Ejercicio Excepcion 2")
    println("17 - Ejercicio Excepcion 3")
    println("18 - Ejercicio Excepcion 4")
}

fun mostrarUnidad3(){
    println("1 - Ejercicio Listas 4")
    println("2 - Ejercicio Listas 6")
    println("3 - Ejercicio Listas 8")
    println("4 - Ejercicio Listas 9")
    println("5 - Ejercicio Listas 1")
    println("6 - Ejercicio Listas 13")
    println("7 - Ejercicio Diccionarios 3")
    println("8 - Ejercicio Diccionarios 5")
    println("9 - Ejercicio Diccionarios 6")
    println("10 - Ejercicio Diccionarios 7")
    println("11 - Ejercicio Diccionarios 8")
    println("12 - Ejercicio Diccionarios 1")
    println("13 - Ejercicio Diccionarios 11")
    println("14 - Ejercicio Conjuntos 1")
    println("15 - Ejercicio Conjuntos 2")
    println("16 - Ejercicio Conjuntos 3")
    println("17 - Ejercicio Conjuntos 4")
    println("18 - Ejercicio Conjuntos 5")
    println("19 - Ejercicio Conjuntos 6")
}
fun elegirUnidad(): Int {
    var unidad: Int? = null
    do {
        mostrarMenu()
        println("Elige la unidad: ")
        unidad = readLine()?.toIntOrNull()
    } while (unidad == null || unidad !in 1..3)
    return unidad
}
fun menuEj(unidad: Int) {
    var salir:Boolean = true
    var ejercicio:Int? = null
    do {
        when(unidad){
            1 -> {
                do{
                    mostrarUnidad1()
                    ejercicio = readln().toIntOrNull()
                }while (ejercicio == null || ejercicio !in 1..11)
                when (ejercicio){
                    1 -> u1Ejercicio4()
                    2 -> u1Ejercicio6()
                    3 -> u1Ejercicio12()
                    4 -> u1Ejercicio15()
                    5 -> u1Ejercicio18()
                    6 -> u1Ejercicio20()
                    7 -> u1Ejercicio21()
                    8 -> u1Ejercicio22()
                    9 -> u1Ejercicio24()
                    10 -> u1Ejercicio26()
                    11 -> u1Ejercicio27()
                }
                salir = false
            }
            2 -> {
                do{
                    mostrarUnidad2()
                    ejercicio = readln().toIntOrNull()
                }while (ejercicio == null || ejercicio !in 1..12)
                when(ejercicio){
                    1 -> u2EjercicioCon2()
                    2 -> u2EjercicioCon3()
                    3 -> u2EjercicioCon6()
                    4 -> u2EjercicioCon8()
                    5 -> u2EjercicioCon10()
                    6 -> u2EjercicioIte2()
                    7 -> u2EjercicioIte4()
                    8 -> u2EjercicioIte6()
                    9 -> u2EjercicioIte7()
                    10 -> u2EjercicioIte8()
                    11 -> u2EjercicioIte13()
                    12 -> u2EjercicioIte15()
                    13 -> u2EjercicioIte18()
                    14 -> u2EjercicioIte19()
                    15 -> u2EjercicioIte25()
                    16 -> u2EjercicioExc2()
                    17 -> u2EjercicioExc3()
                    18 -> u2EjercicioExc4()
                }
                salir = false
            }
            /*
            3 -> {
                do{
                    mostrarUnidad3()
                    ejercicio = readln().toIntOrNull()
                }while (ejercicio == null || ejercicio !in 1..12)
                when(Ejercicioercicio){
                    1 -> u3EjercicioListas04()
                    2 -> u3EjercicioListas06()
                    3 -> u3EjercicioListas08()
                    4 -> u3EjercicioListas09()
                    5 -> u3EjercicioListas10()
                    6 -> u3EjercicioListas13()
                    7 -> u3EjercicioDiccionarios03()
                    8 -> u3EjercicioDiccionarios05()
                    9 -> u3EjercicioDiccionarios06()
                    10 -> u3EjercicioDiccionarios07()
                    11 -> u3EjercicioDiccionarios08()
                    12 -> u3EjercicioDiccionarios10()
                    13 -> u3EjercicioDiccionarios11()
                    14 -> u3EjercicioConjuntos01()
                    15 -> u3EjercicioConjuntos02()
                    16 -> u3EjercicioConjuntos03()
                    17 -> u3EjercicioConjuntos04()
                    18 -> u3EjercicioConjuntos05()
                    19 -> u3EjercicioConjuntos06()
                }
                salir = false
            }*/
        }
    } while (salir)
}
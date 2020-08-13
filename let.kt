fun main(args: Array<String>) {
    println("Bienvenido")
    }


fun pedirCantidadDeAutos() {
    println("Ingrese la cantidad de autos que desea comprar")
    var auto = readLine()
    val texto = ("La cantidad de autos que desea comprar son")
    val textoCompleto = texto +  auto
    println(textoCompleto)

}


var auto = pedirCantidadDeAutos()
fun main(){
    val int = 123
    val long = 123456L
    val double = 12.34
    val float = 12.34F
    val hexadecimal = 0xAB
    val binary = 0b01010101

    print("INT = $int  LONG = $long DOUBLE = $double FLOAT = $float HEXADECIMAL = $hexadecimal BINARY = $binary")

    //CONVERTIR

    var entero = 25
    var flotante = entero.toFloat();
    print("\n entero = $entero a float = $flotante");
    
    var flotant = 25.69
    var enter = flotant.toInt();
    print("\n flotante = $flotant a entero = $enter");

    //BOOLEAN

    val x = 1
    val y = 2
    val z = 2
    val esTrue = x < y && x < z
    val otroTrue = x == y || y == z

    println("\n esTrue = $esTrue \t otroTrue = $otroTrue")
}
fun main(){
    val int = 123
    val long = 123456L
    val double = 12.34
    val float = 12.34F
    val hexadecimal = 0xAB
    val binary = 0b01010101

    print("INT = $int  LONG = $long DOUBLE = $double FLOAT = $float HEXADECIMAL = $hexadecimal BINARY = $binary")

    //CONVERTIR

    var entero:Int = 25
    var flotante:Float = entero.toFloat();
    print("\n entero = $entero a float = $flotante");
    
    var flotant:Float = 25.6.toFloat()
    var enter:Int = flotant.toInt();
    print("\n flotante = $flotant a entero = $enter");

    //BOOLEAN

    val x = 1
    val y = 2
    val z = 2
    val esTrue = x < y && x < z
    val otroTrue = x == y || y == z

    println("\n esTrue = $esTrue \t otroTrue = $otroTrue")

    //CHAR

    var char = "C"
    var char1 = "D"

    val esTR = char == char1
    println("Es char con valor C igual a char1 con valor D? R:  $esTR")

    //CADENAS
    val string = "string con \n una línea nueva"

    val rawString = """
    raw string es útil para
    cadenas con muchas líneas"""

    println("\n\n $string $rawString")

}
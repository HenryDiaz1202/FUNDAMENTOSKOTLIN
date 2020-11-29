class ImpresoraHola(var tam:Int){
   protected imprimirHola() {
    println("Hola!")
    }
   }

fun main(){
    val impresora = ImpresoraHola(3)
    println(impresora.tam)
    impresora.imprimirHola() // imprime Hola!
}
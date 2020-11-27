
fun main(){
    val array = arrayOf(1, 2, 3)
    val cuadradosPerfectos = Array(10, { k -> k * k })

    val elemento1 = array[0]
    val elemento2 = array[1]
    array[2] = 5

    //imprima el array aquí
    for(i in 0..2){
        println(array[i]);
    }
    
   // val cuadradosPerfectos = Array(10, { k -> k * k })
   // perfectSquares.forEach { println("el elemento $it") }
}
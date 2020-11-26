fun main(){

    val calificacion=61
    when(calificacion)
    {
    in 10..20 -> println("hay que motivarse por completo")
    in 30..50 -> println("demuestra un poco mas de trabajo")
    in 50..59 -> println("por poco")
    60 -> println("estuvo peligroso esta operacion")
    in 61..100-> println("Aprobado")
    in 80..100 -> println("Excelente resultado")
    !in 1..100 -> println("no conozco ese resultado")
    else -> println("sigo sin conocer esto")
    }
}

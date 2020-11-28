open class Persona(var nombre:String, var apellido:String)

class Estudiante(nombre:String, apellido:String,
 var asignatura:String,
 var profesor:String):
 Persona(nombre,apellido)

fun main(){

    var estudiante = Estudiante("James","Reyes","Recursos Naturales","Eddy Herrera")

    println("Asignatura: ${estudiante.asignatura} Estudiante: ${estudiante.nombre}")
}
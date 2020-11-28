//HACER EN LA CASA, METERLO A GIT



/*class Persona{
    var nombre:String = ""
    var apellido:String = ""
    constructor(){
    }
    constructor(n:String, a:String):this()
    {
    nombre=n
    apellido=a
    }
}*/

class Persona(var nombre:String, var apellido:String)

fun main(){

    var lista_personas = ArrayList<Persona>()

    var persona = Persona("Yesser","Miranda")
    var nueva = Persona("Juan","Lopez")
    var nueva1 = Persona("Henry","Diaz")

    /*var nueva = Persona()
    nueva.nombre = "Juan"
    nueva.apellido = "Lopez"*/

    lista_personas.add(persona)
    lista_personas.add(nueva)
    lista_personas.add(nueva1)

    for(i in 0..2){
        println("Nombre : ${lista_personas[i].nombre} _${lista_personas[i].apellido}")
    }
   }
   
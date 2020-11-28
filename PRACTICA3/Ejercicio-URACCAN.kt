class Universidad(var recinto:String, var direccion:String)

open class Persona(var nombre:String, var apellido:String,var cedula:String,var edad:Int)

class Profesores(nombre:String, apellido:String, cedula:String, edad:Int,var facultad:String, var cantAsg:Int) : Persona(nombre,apellido,cedula,edad)

class Estudiante(nombre:String, apellido:String, cedula:String, edad:Int, var nivelE:String, var prof_Rep:String) :  Persona(nombre,apellido,cedula,edad)

class Administrativos(nombre:String, apellido:String, cedula:String, edad:Int,var area:String, var jefe:String) : Persona(nombre,apellido,cedula,edad)

fun main(){

    //UNIVERSIDAD CLASE
    var lista_universidad = ArrayList<Universidad>()
    var universidad = Universidad("Las minas","Barrio Sandino");
    var universidad1= Universidad("Waslala","Barrio wawa");
    var universidad2 = Universidad("Bilwi","Barrio puerto");

    lista_universidad.add(universidad)
    lista_universidad.add(universidad1)
    lista_universidad.add(universidad2)
    //PROFESORES CLASE
    var lista_profesores = ArrayList<Profesores>()
    var profesor = Profesores("Yesser","Miranda","451-252525-125F",25,"Ingeniería",5)
    var profesor1 = Profesores("Ismael","Mendoza","452-252525-125G",28,"Social",3)
    var profesor2 = Profesores("Marina","Flores","453-252525-125X",30,"Ambiente",6)

    lista_profesores.add(profesor)
    lista_profesores.add(profesor1)
    lista_profesores.add(profesor2)
    //ESTUDIANTES CLASE
    var lista_estudiantes = ArrayList<Estudiante>()
    var estud = Estudiante("Henry","Díaz","610-1252525-1000E",19,"Tercero","Yasmil Castillo")
    var estud1 = Estudiante("Beatriz","Sánchez","610-1252525-1000E",19,"Tercero","Yasmil Castillo")
    var estud2 = Estudiante("Víctor","Zeledón","610-1252525-1000E",19,"Tercero","Yasmil Castillo")

    lista_estudiantes.add(estud)
    lista_estudiantes.add(estud1)
    lista_estudiantes.add(estud2)
    //ADMINISTRATIVOS CLASE
    var lista_administrativos = ArrayList<Administrativos>()
    var admin = Administrativos("Miguel","Torrez","610-1252525-1000E",30,"Administración","Anielka Mendoza")
    var admin1 = Administrativos("Andrea","Pérez","610-1252525-1000F",25,"Administración","Eliezer Rivera")
    var admin2 = Administrativos("Francisco","Gerez","610-1252525-1000E",32,"Administración","Juan Mendoza")

    lista_administrativos.add(admin)
    lista_administrativos.add(admin1)
    lista_administrativos.add(admin2)

    //MUESTRA DE TODOS LOS DATOS
    println("\t---------------------------------------------------------------")
    println("\tUNIVERSIDAD")
    println("\t---------------------------------------------------------------")
    for(i in 0..2){
        println("\tUniversidad : URACCAN \tRECINTO : ${lista_universidad[i].recinto} \t DIRECCION : ${lista_universidad[i].direccion}")
    }
    println("\n\t---------------------------------------------------------------")
    println("\tPROFESORES")
    println("\t---------------------------------------------------------------")
    for(i in 0..2){
        println("\t${i}  NOMBRE Y APELLIDO : ${lista_profesores[i].nombre}_${lista_profesores[i].apellido}\t CÉDULA : ${lista_profesores[i].cedula} \t EDAD : ${lista_profesores[i].edad} \tFACULTAD : ${lista_profesores[i].facultad} \t CANTIDAD ASIGNATURAS : ${lista_profesores[i].cantAsg}")
    }
    println("\n\t---------------------------------------------------------------")
    println("\tESTUDIANTES")
    println("\t---------------------------------------------------------------")
    for(i in 0..2){
        println("\t${i}  NOMBRE Y APELLIDO : ${lista_estudiantes[i].nombre}_${lista_estudiantes[i].apellido}\t CÉDULA : ${lista_estudiantes[i].cedula} \t EDAD : ${lista_estudiantes[i].edad} \tNIVEL EDUCATIVO : ${lista_estudiantes[i].nivelE} \t PROFESOR REPRESENTANTE : ${lista_estudiantes[i].prof_Rep}")
    } 
    println("\n\t---------------------------------------------------------------")
    println("\tADMINISTRATIVOS")
    println("\t---------------------------------------------------------------")
    for(i in 0..2){
        println("\t${i}  NOMBRE Y APELLIDO : ${lista_administrativos[i].nombre}_${lista_administrativos[i].apellido}\t CÉDULA : ${lista_administrativos[i].cedula} \t EDAD : ${lista_administrativos[i].edad} \tÁREA : ${lista_administrativos[i].area} \t JEFE INMEDIATO : ${lista_administrativos[i].jefe}")
    }

}
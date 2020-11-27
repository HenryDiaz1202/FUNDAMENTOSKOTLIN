fun main(){

    //WHILE

        //infinito
        /*while (true) {

            println("Esto se imprimirá por un largo tiempo!")
        }  */  
        var a:Int = 0
        while (a<=10) {

            println("Esto se imprimirá por un largo tiempo!")
            a++;
        }  
    //FOR
        val array = arrayOf("a", "b", "c")
        for (i in array.indices) {
        println(array[i])
        }
        for (i in 6 downTo 0 step 2) {
        println(i)
        }
}

fun obtenerTamString(obj: Any): Int? {
 if (obj is String)
 return obj.length // sin conversion necesaria
 else
 println("es un numero ${obj as Int}")
 return null
}
fun main(args: Array<String>) {
 obtenerTamString("aabbcc")
 obtenerTamString(2)
}
/**
 * Main that tests functions of pila
 */
fun main() {
    val numbers = listOf("one", "two", "three", "four")
    val numbersRev = reverse(numbers)

    if (!listOf("four", "three", "two", "one").equals(numbersRev))
        println("Error")
    else
        println("Correcto")
    println(numbersRev)
}

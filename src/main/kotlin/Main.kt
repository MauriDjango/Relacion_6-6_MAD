
fun main() {
    val numbers = listOf("one", "two", "three", "four")
    val numbersRev: List<String> = reverse(numbers)

    if (!numbers.equals(numbersRev))
        println("Error")

    else
        println("Correcto")


}

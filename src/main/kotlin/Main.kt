
fun main() {
    val numbers = listOf("one", "two", "three", "four")
    val numbersRev = numbers.reversed()

    if (!listOf("four", "three", "two", "one").equals(numbersRev)) {
        println("Error")
    }
    else {
        println("Correcto")
        println(numbersRev)
    }

    val myPila = Pila(emptyList())
    println(myPila.empty())
    myPila.push("one")
    myPila.push("two")
    myPila.push("three")
    myPila.push("four")
    myPila.push("five")

    println(myPila.top())
    myPila.pop()
    println(myPila)

    val myPilaReverse = myPila.reverse()

    if (!listOf("four", "three", "two", "one").equals(myPilaReverse)) {
        println("Error")
    }
    else {
        println("Correcto")
        println(myPilaReverse)
    }
}


class Pila<T>  {
    private var stack: List<T> = emptyList()

    fun top() = stack.last()

    fun push(newMember: T) {
        stack = stack.plus(newMember)
    }

    fun pop() {
        stack = stack.dropLast(1)
    }

    fun empty() = stack.isEmpty()


    override fun toString(): String {
        return "Top: ${top()}, Empty: ${empty()}, Contents: $stack"
    }
}

fun <T> reverse(numbers: List<T>): List<T> {

    val normalPila = Pila<T>()
    var reverseList = listOf<T>()

    for (item in numbers.iterator()) {
        normalPila.push(item)
    }
    for (item in numbers.iterator()) {
        reverseList = reverseList.plus(normalPila.top())
        normalPila.pop()
    }

    return reverseList
}


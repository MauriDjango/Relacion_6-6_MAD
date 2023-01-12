
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
    val reversePila = Pila<T>()
    var reverseList = emptyList<T>()

    for (item in numbers.iterator()) {
        normalPila.push(item)
    }
    for (item in numbers.iterator()) {
        reversePila.push(normalPila.top())
        normalPila.pop()
    }
    for (item in numbers.iterator()) {
        reverseList = reverseList.plus(reversePila.top())
        reversePila.pop()
    }
    return reverseList
}


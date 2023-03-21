
/**
 * Pila that acs as a stack implementing lists
 * @property stack = List
 */
class Pila<T>  {
    private var stack: List<T> = emptyList()

    /**
     * Returns the top item of the stack
     */
    fun top() = stack.last()

    /**
     * Adds an item to the top of the stack
     */
    fun push(newMember: T) {
        stack = stack.plus(newMember)
    }

    /**
     * Pops the item off the top of the stack
     */
    fun pop() {
        stack = stack.dropLast(1)
    }

    /**
     * Checks if the stack is empty
     */
    fun empty() = stack.isEmpty()

    /**
     * Overrides toString to give info about the stack
     */
    override fun toString(): String {
        return "Top: ${top()}, Empty: ${empty()}, Contents: $stack"
    }
}

/**
 * Inverts the order of the stack
 */
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


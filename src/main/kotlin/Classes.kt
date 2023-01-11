interface Iterator {
    fun run(pila: Pila) = pila.stack.iterator()
}

class Pila(var stack: List<Any>): Iterator {
    fun top() = stack.last()

    fun push(newMember: Any) {
        stack = stack.plus(newMember)
    }

    fun pop() {
        stack = stack.dropLast(1)
    }

    fun empty() = stack.isEmpty()

    fun reverse() = stack.reversed()

    override fun toString(): String {
        return "Top: ${top()}, Empty: ${empty()}, Contents: $stack"
    }
}


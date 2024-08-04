fun solution(A: IntArray): Int {
    // Implement your solution here

    val occurrenceMap = mutableMapOf<Int, Int>()

    A.forEach { i ->
        occurrenceMap[i] = (occurrenceMap[i] ?: 0) + 1
    }
    var result = 0
    for (i in A) {
        if (((occurrenceMap[i] ?: 1) % 2) == 1) {
            result = i
            break
        }
    }

    return result
}

// XOR
fun solution2(A: IntArray): Int {
    // Implement your solution here
    var result = 0
    A.forEach { i ->
        result = i xor result
    }
    return result
}
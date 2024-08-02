fun main() {
    solution1(intArrayOf(3,8,9,7,3,8,9,7,3,8,9,7,3,8,9,7,3,8,9,7,3,8,9,7,6), 3).forEach { i ->
        println(i)
    }
}

fun solution1(A: IntArray, K: Int): IntArray {
    // Implement your solution here
    if (K == 0 || A.isEmpty()) return A
    var count = 0
    var temp = A[0]
    var index = 0
    var num: Int
    while (count <= A.size) {
        num = temp
        val newIndex = getNewIndex(index, A.size, K)
        temp = A[newIndex]
        A[newIndex] =  num
        index = newIndex
        count++
    }
    return A
}

fun solution2(A: IntArray, K: Int): IntArray {
    // Implement your solution here

    val result = A.copyOf()
    if (K == 0) return result
    A.forEachIndexed { index, i ->
        val newIndex = getNewIndex(index, A.size, K)
        result[newIndex] = i
    }
    return result
}

fun getNewIndex(index: Int, len: Int, shift: Int): Int = (index + (shift % len)) % len

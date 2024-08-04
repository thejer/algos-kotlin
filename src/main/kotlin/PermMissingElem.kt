class PermMissingElem {
    fun solution(A: IntArray): Int {
        // Implement your solution here
        var sum = 0
        for (i in 1..(A.size + 1)) {
            sum += i
        }
        for (i in A) {
            sum -= i
        }
        return sum
    }
}
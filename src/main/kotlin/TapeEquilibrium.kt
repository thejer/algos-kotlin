import kotlin.math.abs

class TapeEquilibrium {
    private fun solution(A: IntArray): Int {
        // Implement your solution here
        var min = Int.MAX_VALUE
        var rtl = A.sum()
        var ltr = 0
        for (i in 0..A.size -2) {
            rtl -= A[i]
            ltr += A[i]
            min = abs(ltr - rtl).coerceAtMost(min)
        }
        return min
    }

    fun main () {
        TapeEquilibrium().solution(intArrayOf(-1000, 1000))
    }
}
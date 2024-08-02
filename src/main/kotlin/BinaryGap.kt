
fun main() {
    println(solution(529))
}

fun solution(N: Int): Int {
    // Implement your solution here

    var divi = N
    var max = Int.MIN_VALUE
    var count = 0
    var isOpen = false
    while (divi > 0) {
        val rem = divi%2
        divi = divi/2
        if (rem == 0) {
            if (isOpen) {
                count++
            }
        }

        if (rem == 1) {
            max = maxOf(count, max)
            count = 0
            isOpen = true
        }
    }
    return max
}
fun solution(X: Int, Y: Int, D: Int): Int {
    // Implement your solution here

    if (Y == X) return 0
    val diff = Y - X
    val result = diff / D
    if (diff < D) return 1
    val top = if ((diff % D) > 0)  1 else 0
    return result + top
}

fun main() {
    solution(10, 85, 30)
}
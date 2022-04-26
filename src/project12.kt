import java.util.*

object While27 {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        print("n = ")
        val n: Int = scanner.nextInt()
        var f1 = 1
        var f2 = 1
        var f = 1
        var k = 2
        while (n > f) {
            f = f1 + f2
            f1 = f2
            f2 = f
            k = k + 1
            if (f == n) {
                println(k)
            }
        }
    }
}
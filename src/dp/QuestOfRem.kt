package dp

import java.lang.Integer.parseInt
import java.lang.Long.parseLong

fun main(args: Array<String>) {
    var t = parseInt(readLine())
    while (t-- > 0) {
        var res: Long = 0
        val n = parseLong(readLine())
        if (n == 1L) {
            res = 1
        } else if (n and 1 == 1L) {
            res = n / 2 + 1
        } else
            res = n / 2
        println(res)
    }

}
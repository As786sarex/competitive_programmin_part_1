package kotlinprac

import java.lang.Integer.parseInt

fun main(args: Array<String>) {
    var t = parseInt(readLine())
    while (t-- > 0) {
        val str = readLine()?.split(" ")
        var n: Int = parseInt(str?.get(0))
        val k: Int = parseInt(str?.get(1))
        val x: Int = n % 10;
        n /= 10
        val added = (x + (k % 10)) % 10
        if (n == 0) {
            println(added)
        } else {
            println("$n$added")
        }
    }

}
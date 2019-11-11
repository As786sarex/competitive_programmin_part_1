package dp

import java.util.HashMap

    private var set: HashMap<String, Int>? = null

    private fun emails(vararg emails: String) {
        val e = emails.size
        var pos = 1
        for (email in emails) {
            val arr = email.split(", ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val s1 = arr[0].split("@".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[0]
            val s2 = arr[1].split("@".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[0]
            if (set!!.containsKey(s1 + s2) || set!!.containsKey(s2 + s1)) {
                if (set!!.containsKey(s1 + s2)) {
                    println(set!![s1 + s2].toString() + " " + 1)
                } else {
                    println(set!![s2 + s1].toString() + " " + 2)
                }
            } else {
                set!![s1 + s2] = pos
                println("$pos 1")
                pos++
            }
        }
    }

        fun main(args: Array<String>) {
            val s1 = "asif@gmail.com, rex@gmail.com, hi,how are you?"
            val s2 = "as@gmail.com, rex@gmail.com, hello?"
            val s3 = "aif@gmail.com, free@gmail.com, great..."
            val s4 = "rex@gmail.com, asif@gmail.com, guruji...."
            set = HashMap()
            emails(s1, s2, s3, s4)
        }



package wipro_practice

fun main(args: Array<String>) {
    var t=Integer.parseInt(readLine())
    val set=HashSet<Char>()
    val arr=ArrayList<Char>();
    while(t-->0){
        val str=readLine()
        if (str != null) {
            for(i in 0 until str.length){
                if (!set.contains(str[i])){
                    arr.add(str[i])
                    set.add(str[i])
                }
            }
        }
        arr.forEach(::print)
        println()
        arr.clear()
        set.clear()
    }
}
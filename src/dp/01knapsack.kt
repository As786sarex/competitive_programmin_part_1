package dp

import kotlin.math.max

fun main(args: Array<String>) {
    val wt = intArrayOf(10, 40, 20, 30)
    val valu = intArrayOf(60, 40, 100, 120)
    val capacity = 50
    print(knapsack(wt.size,capacity,wt,valu))
}

fun knapsack(n:Int, W : Int, weight:IntArray, value:IntArray ): Int{

    val k = Array(n+1) { IntArray(W+1) }
    for (i in 0 until n+1){
        for(j in 0 until W+1){
            when {
                (i==0) or (j==0) -> k[i][j]=0
                weight[i-1]<=j -> k[i][j]= max((value[i-1]+k[i-1][j-weight[i-1]]),k[i-1][j])
                else -> k[i][j]=k[i-1][j]
            }
        }
    }
    return k[n][W];
}
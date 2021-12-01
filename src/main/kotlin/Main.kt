fun main(args: Array<String>) {

}

fun getCoins(): IntArray {
    return intArrayOf(100, 50, 20, 10, 5, 2, 1)
}

//£5.00 = 500
//£4.93 = 493
fun calculateSmallestChange(amount: Int): IntArray {
    if (amount < 0) throw IllegalArgumentException()
    if (amount == 0) return intArrayOf()

    val coins = getCoins()
    if (coins.contains(amount)) return intArrayOf(amount)

    val change = mutableListOf<Int>()

    var leftOver = amount

    while (leftOver > 0) {
        for (coin in coins) {
            if (coin <= amount) {
                change.add(coin)
                leftOver -= coin
                continue
            }
        }
        leftOver = 0
    }

    return change.toIntArray()
}
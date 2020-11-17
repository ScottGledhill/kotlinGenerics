package Contest

interface Retailer<out T> {
    fun sell() : T
}
package Contest

class CatRetailer : Retailer<Cat> {
    override fun sell(): Cat {
        println("Sell Contest.Contest.Cat")
        return Cat("")
    }
}
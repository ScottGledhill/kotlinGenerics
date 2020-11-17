package Contest

class FishRetailer : Retailer<Fish> {
    override fun sell(): Fish {
        println("Sell Contest.Fish")
        return Fish("")
    }
}
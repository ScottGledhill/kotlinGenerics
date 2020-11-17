package Contest

class DogRetailer : Retailer<Dog> {
    override fun sell(): Dog {
        println("Sell Contest.Dog")
        return Dog("")
    }
}
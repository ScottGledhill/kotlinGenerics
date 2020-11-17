package Contest

class Main {
    val catFuzz = Cat("Fuzz Lightyear")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny McGraw")

    val catVet = Vet<Cat>()
    val fishVet = Vet<Fish>()
    val petVet = Vet<Pet>()

    catVet.treat(catFuzz)
    petVet.treat(catKatsu)
    petVet.treat(fishFinny)

    val catContest = Contest<Cat>(catVet)
    catContest.addScore("idiotcatname", 9)  // will only accept types of cat
    catContest.addScore("differentCatName", 8)
    val catWinner = catContest.getWinners()

    val petContest = Contest<Pet>(petVet)
    petContest.addScore(Dog("idiotcatname", 9))
    petContest.addScore(Fish("differentCatName", 8))

    val fishContest = Contest<Fish>(fishVet)

    val topCat = catContest.getWinners().first()
    val topPet = petContest.getWinners().first()
    val topFish = fishContest.getWinners().first()

    println("Contest.Contest.Cat contest winner is ${topCat.name}")
    println("Contest.Pet contest winner is ${topPet.name}")
    println("Contest.Fish contest winner is ${topFish.name}")

    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()
    val fishRetailer: Retailer<Fish> = FishRetailer()
    petRetailer.sell()
}
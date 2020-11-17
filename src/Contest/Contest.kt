package Contest

class Contest<T: Pet>(var vet: Vet<in T>) {
    private val scores: MutableMap<T, Int> = mutableMapOf() // T is generic type of Contest.Pet that the contest is dealing with

    fun addScore(t: T, score:Int = 0) {
        if (score >= 0) scores.put(t, score)
    }
    fun getWinners() : MutableSet<T> {
        val highScore = scores.values.maxOrNull()
        val winners: MutableSet<T> = mutableSetOf()
        for ((t, score) in scores) {
            if (score == highScore) winners.add(t)
        }
        return winners
    }
}

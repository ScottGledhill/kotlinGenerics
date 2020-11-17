package Contest

class Vet<T: Pet> {
    fun treat(t:T) {
        println("Treat Pete ${t.name}")
    }
}
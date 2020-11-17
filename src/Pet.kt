abstract class Pet(var name: String) {
    class Fish(name: String) : Pet(name)
    class Cat(name: String) : Pet(name)
    class Dog(name: String) : Pet(name)
}
package week05.Inheritance;      

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
} //subclass of the Animal class

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
} //subclasses of the Animal class

//Hierarchical inheritance type
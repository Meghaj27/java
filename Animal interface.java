// Define the Animal interface
interface Animal {
    void bark();
}

// Dog class implements Animal interface
class Dog implements Animal {
    // Override the bark method
    public void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class to run the program
public class AnimalDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.bark();
    }
}

import ex4.Animal;
import ex4.Cat;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("animal");
        Cat cat = new Cat("たま");
        System.out.println(animal.getName());
        System.out.println(cat.getName());
        animal.makeSound();
        cat.makeSound();
    }
    
}

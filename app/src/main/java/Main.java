import ex4.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("animal");
        System.out.println(animal.getName());
        animal.makeSound();
    }
    
}

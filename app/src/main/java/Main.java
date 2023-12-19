import ex4.Animal;
import ex4.Cat;
import ex4.Doc;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("animal");
        Cat cat = new Cat("たま");
        Doc doc = new Doc("ポチ");
        System.out.println(animal.getName());
        System.out.println(cat.getName());
        System.out.println(doc.getName());
        animal.makeSound();
        cat.makeSound();
        doc.makeSound();
        doc.swim();
    }
    
}

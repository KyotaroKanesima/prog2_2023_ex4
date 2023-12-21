import ex4.Animal;
import ex4.Bird;
import ex4.Cat;
import ex4.Doc;

public class Main {
    public static void main(String[] args) {
        //演習4.2
        Animal animal = new Animal("animal");
        System.out.println(animal.getName());
        animal.makeSound();
        //演習4.3
        Cat cat = new Cat("たま");
        System.out.println(cat.getName());
        cat.makeSound();
        //演習4.4
        Doc doc = new Doc("ポチ");
        System.out.println(doc.getName());
        doc.makeSound();
        doc.swim();
        //演習4.5
        Bird bird = new Bird("チュン太朗");
        System.out.println(bird.getName());
        bird.makeSound();
        bird.fly();
        
        
    }
    
}

import ex4.Animal;
import ex4.Bird;
import ex4.Cat;
import ex4.Dog;


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
        Dog dog = new Dog("ポチ");
        System.out.println(dog.getName());
        dog.makeSound();
        dog.swim();
        //演習4.5
        Bird bird = new Bird("チュン太朗");
        System.out.println(bird.getName());
        bird.makeSound();
        bird.fly();
        
        /** 
        //演習4.6
        Animal[] animals = new Animal[4];
        animals[0] = new Animal("オリジナル動物");
        animals[1] = new Dog("猫");
        animals[2] = new Cat("ポチ");
        animals[3] = new Bird("旧Twitter");

        for (Animal animal : animals) {
            animal.makeSound();
            if (animal instanceof Flyable) {
                ((Flyable) animal).fly();
            }
            if (animal instanceof Swimmable) {
                ((Swimmable) animal).swim();
            }
        }
        */
        
    }
    
}

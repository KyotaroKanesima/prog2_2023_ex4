package ex4;

public class Dog extends Animal implements Swimmable{
    public Dog(String _name){
    super(_name);
    }
    @Override
    public void makeSound(){
        System.out.println(getName() + "がワンと鳴いた");
    }
    @Override
    public void swim(){
        System.out.println(getName() + "は泳いでいる");
    }

    
    
}

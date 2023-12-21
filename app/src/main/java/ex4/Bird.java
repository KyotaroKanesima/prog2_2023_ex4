package ex4;

public class Bird extends Animal implements Flyable{
    public Bird(String _name){
        super(_name);
    }
    @Override
    public void makeSound(){
        System.out.println(getName() + "はチュンチュンと鳴いた");
    }
    @Override
    public void fly(){
        System.out.println(getName() + "はぱたぱたと飛んでいる");
    }
}

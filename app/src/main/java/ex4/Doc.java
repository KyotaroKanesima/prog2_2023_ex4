package ex4;

public class Doc extends Animal implements Swimmable{
    public Doc(String _name){
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

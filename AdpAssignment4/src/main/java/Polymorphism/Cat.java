package Polymorphism;

public class Cat extends Barn{
    @Override
    public void generateSound(){
        System.out.println("Meooows");
    }
    public static void main(String args[]){
        Cat obj = new Cat();
        obj.generateSound();
    }

}

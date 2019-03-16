package Inheritance;

import Inheritance.Dog;

//Q1
//Child class for inheritance
public class Puppy extends Dog {

    public static void main(String args[]){
        Dog obj = new Dog();
        System.out.println(obj.breed);
        System.out.println(obj.gender);
        System.out.println(obj.status);
        obj.does();

}
    }

package Encapsulation;

public class RunEncapsulation {
    public  void run() {
        Encapsulation obj = new Encapsulation();
// setting values
        obj.setAnimal("Dog");
        obj.setBreed("Husky");
        obj.setAge(20);

// calling values and displaying
        System.out.println(" animal: " + obj.getAnimal());
        System.out.println(" breed: " + obj.getBreed());
        System.out.println(" age: " + obj.getAge());
// System.out.println("Geek's roll: " + obj.geekName);
    }

    public static void main(String[] args) {
        RunEncapsulation run=new RunEncapsulation();
                run.run();
    }

}

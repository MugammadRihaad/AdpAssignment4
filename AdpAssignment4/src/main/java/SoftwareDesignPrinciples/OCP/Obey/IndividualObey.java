//Q3
//The Open/Closed Principle (OCP)
//Obeys the principle
package SoftwareDesignPrinciples.OCP.Obey;

public abstract class IndividualObey {
    protected double salary;
    protected int age;
    protected String name;

    protected IndividualObey(double salary, int age, String name) {
        this.salary = salary;
        this.age = age;
        this.name = name;
    }

    abstract double calculateTax();
}

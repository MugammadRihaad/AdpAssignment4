//Q3
//The Open/Closed Principle (OCP)
//Obeys the principle
package SoftwareDesignPrinciples.OCP.Obey;

public class FemaleObey extends IndividualObey {
    public FemaleObey(double salary, int age, String name) {
        super(salary, age, name);
    }

    /* Tax slab male = 25% on taxable */
    public double calculateTax() {
        return 0.25 * this.salary;
    }

}

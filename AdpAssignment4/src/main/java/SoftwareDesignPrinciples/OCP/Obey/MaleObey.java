//Q3
//The Open/Closed Principle (OCP)
//Obeys the principle
package SoftwareDesignPrinciples.OCP.Obey;

import SoftwareDesignPrinciples.OCP.Obey.IndividualObey;

public class MaleObey extends IndividualObey {
    public MaleObey(double salary, int age, String name) {
        super(salary, age, name);
    }

    /* Tax slab male = 25% on taxable */
    public double calculateTax() {
        return 0.25 * this.salary;
    }
}

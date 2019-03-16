//Q3
//The Open/Closed Principle (OCP)
//Obeys the principle
package SoftwareDesignPrinciples.OCP.Obey;

import SoftwareDesignPrinciples.OCP.Obey.IndividualObey;

public class SrCitizenFemaleObey extends IndividualObey {
    public SrCitizenFemaleObey(double salary, int age, String name) {
        super(salary, age, name);
    }

    /*
     * Income Tax slab senior citizen female = 17% on taxable income
     */
    public double calculateTax() {
        return 0.17 * this.salary;
    }
}

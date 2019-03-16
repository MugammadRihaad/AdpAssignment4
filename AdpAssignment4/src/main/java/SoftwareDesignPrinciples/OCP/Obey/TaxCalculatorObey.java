//Q3
//The Open/Closed Principle (OCP)
//Obeys the principle
package SoftwareDesignPrinciples.OCP.Obey;

import SoftwareDesignPrinciples.OCP.Obey.IndividualObey;

public class TaxCalculatorObey {
    public double calculateTax(IndividualObey individual) {
        return individual.calculateTax();
    }
}

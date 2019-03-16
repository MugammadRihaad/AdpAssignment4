//Q3
//The Open/Closed Principle (OCP)
//Violates the principle


package SoftwareDesignPrinciples.OCP.Violate;

import SoftwareDesignPrinciples.OCP.Violate.IndividualViolate;

public class TaxCalculatorViolate {
    public double calculateTax(IndividualViolate indiv) {
        double tax = 0;
        switch (indiv.getGender()) {
            case MALE:
                tax = 0.25 * indiv.getSalary();
                break;
            case FEMALE:
                tax = 0.20 * indiv.getSalary();
                break;
            case SR_CITIZEN_FEMALE:
                tax = 0.17 * indiv.getSalary();
                break;
            default:
                //Handler exception condition
                System.out.println("Unknown choice");
                tax = -1;
                break;
        }
        return tax;
    }
}

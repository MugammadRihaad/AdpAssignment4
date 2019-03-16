//Q3
//The Open/Closed Principle (OCP)
//Violates the principle
package SoftwareDesignPrinciples.OCP.Violate;

public class CharteredAcccountantViolate {
    public static void main(String[] args) {
        IndividualViolate tauriq = new IndividualViolate(1230, 22, "Tauriq", IndividualViolate.Gender.MALE);
        IndividualViolate ismail = new IndividualViolate(1000, 24, "Ismail", IndividualViolate.Gender.MALE);

        TaxCalculatorViolate taxCalculator = new TaxCalculatorViolate();
        System.out.println("1. Tax liability of Tauriq is: " + taxCalculator.calculateTax(tauriq));
        System.out.println("2. Tax liability of Ismail is: " + taxCalculator.calculateTax(ismail));
    }

}

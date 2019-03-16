//Q3
//The Open/Closed Principle (OCP)
//Obeys the principle
package SoftwareDesignPrinciples.OCP.Obey;

public class CharteredAccountantObey {
    public static void main(String[] args) {
        IndividualObey tauriq = new MaleObey(1350, 22, "Tauriq");
        IndividualObey ismail = new MaleObey(1000, 24, "Ismail");

        TaxCalculatorObey taxCalculator = new TaxCalculatorObey();
        System.out.println("1. Tax liability of Tauriq is: " + taxCalculator.calculateTax(tauriq));
        System.out.println("2. Tax liability of Ismail is: " + taxCalculator.calculateTax(ismail));
    }
}

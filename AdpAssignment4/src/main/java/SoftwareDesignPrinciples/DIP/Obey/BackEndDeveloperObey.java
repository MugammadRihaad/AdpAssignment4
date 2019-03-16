//Q3
//TheDependency-InversionPrinciple(DIP)
//Obeys the principle
package SoftwareDesignPrinciples.DIP.Obey;

public class BackEndDeveloperObey implements DeveloperObey {
    @Override
    public void develop() {
        writeJava();
    }
    private void writeJava() {
    }
}

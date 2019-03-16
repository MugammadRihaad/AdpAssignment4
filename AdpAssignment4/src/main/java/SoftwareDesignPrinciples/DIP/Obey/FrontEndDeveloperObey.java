//Q3
//TheDependency-InversionPrinciple(DIP)
//Obeys the principle
package SoftwareDesignPrinciples.DIP.Obey;

import SoftwareDesignPrinciples.DIP.Obey.DeveloperObey;

public class FrontEndDeveloperObey implements DeveloperObey {
    @Override
    public void develop() {
        writeJavascript();
    }
    public void writeJavascript() {
    }
}

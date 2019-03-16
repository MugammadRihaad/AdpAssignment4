//Q3
//TheDependency-InversionPrinciple(DIP)
//Violates the principle
package SoftwareDesignPrinciples.DIP.Violate;

import SoftwareDesignPrinciples.DIP.Violate.BackEndDeveloperViolate;
import SoftwareDesignPrinciples.DIP.Violate.FrontEndDeveloperViolate;

public class ProjectViolate {
    private BackEndDeveloperViolate backEndDeveloper = new BackEndDeveloperViolate();
    private FrontEndDeveloperViolate frontEndDeveloper = new FrontEndDeveloperViolate();
    public void implement() {
        backEndDeveloper.writeJava();
        frontEndDeveloper.writeJavascript();
    }
}

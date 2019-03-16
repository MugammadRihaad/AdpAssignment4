//Q3
//TheDependency-InversionPrinciple(DIP)
//Obeys the principle
package SoftwareDesignPrinciples.DIP.Obey;

import SoftwareDesignPrinciples.DIP.Obey.DeveloperObey;

import java.util.List;

public class ProjectObey {
    private List<DeveloperObey> developers;
    public ProjectObey(List<DeveloperObey> developers) {
        this.developers = developers;
    }
    public void implement() {
        developers.forEach(d->d.develop());
    }

}

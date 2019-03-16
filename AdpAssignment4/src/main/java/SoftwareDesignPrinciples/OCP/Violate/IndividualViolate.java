//Q3
//The Open/Closed Principle (OCP)
//Violates the principle
package SoftwareDesignPrinciples.OCP.Violate;

public class IndividualViolate {
    private Gender gender;
    private double salary;
    private int age;
    private String name;

    public IndividualViolate(double salary, int age, String name, Gender gender) {
        this.gender = gender;
        this.salary = salary;
        this.age = age;
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }








    enum Gender {
        MALE, FEMALE, SR_CITIZEN_FEMALE
    }
}

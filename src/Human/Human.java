package Human;

import java.util.ArrayList;

import Country.Country;

public class Human {
    
    private String name;
    private double age;
    private ArrayList<String> props;
    private int IQ;
    private String education;
    private double salary;
    private int expectedOnDestroy;
    private Country country;
    public double wallet;

    public Human (
        String name,
        int IQ,
        double salary,
        String education,
        int expectedOnDestroy,
        Country country
    ) {
        this.name = name;
        this.age = 0;
        this.IQ = IQ;
        this.education = education;
        this.salary = salary;
        this.expectedOnDestroy = expectedOnDestroy;
        this.props = new ArrayList<String>();
        this.country = country;
        this.wallet = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public double getAge() {
        return this.age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public String getEducation() {
        return education;
    }

    public int getIQ() {
        return IQ;
    }

    public ArrayList<String> getProps() {
        return props;
    }

    public double getSalary() {
        return salary;
    }

    public void sayHello() {
        System.out.println("Hello !");
    }

    public int getExpectedOnDestroy() {
        return expectedOnDestroy;
    }

    public void setExpectedOnDestroy(int expectedOnDestroy) {
        this.expectedOnDestroy = expectedOnDestroy;
    }

    public Country getCountry() {
        return country;
    }

    public void liveForMonth() {
        this.age += 0.1;
    }

    public void liveForYear() {
        this.age += 1;
    }

    public void getAllProps() {
        System.out.println("[NAME]" + getName());
        System.out.println("[AGE]" + getAge());
        System.out.println("[PROPS]" + getProps());
        System.out.println("[IQ]" + getIQ());
        System.out.println("[EDUCATION]" + getEducation());
        System.out.println("[EXPECTED_ON_DESTROY]" + getExpectedOnDestroy());
        System.out.println("[COUNTRY]" + getCountry());
    }
}


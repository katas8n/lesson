package Human;

import java.util.ArrayList;

public class Human {
    
    private String name;
    private int age;
    private ArrayList<String> props;
    private int IQ;
    private String education;
    private double salary;
    private int expectedOnDestroy;

    public Human (
        String name,
        int IQ,
        double salary,
        String education,
        int expectedOnDestroy
    ) {
        this.name = name;
        this.age = 0;
        this.IQ = IQ;
        this.education = education;
        this.salary = salary;
        this.expectedOnDestroy = expectedOnDestroy;
        this.props = new ArrayList<String>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
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
}


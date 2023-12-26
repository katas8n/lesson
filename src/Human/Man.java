package Human;

import Country.Country;

public class Man extends Human {
    private String gender = "man";

    public Man(
        String name,
        int IQ,
        double salary,
        String education,
        int expectedOnDestroy,
        Country country
    ) {
        super(name, IQ, salary, education, expectedOnDestroy, country);
        this.setExpectedOnDestroy(63);
    }


    public String getGender() {
        return gender;
    }

}

package Human;

public class Man extends Human {
    private String gender = "man";

    public Man(
        String name,
        int IQ,
        double salary,
        String education,
        int expectedOnDestroy,
        String country
    ) {
        super(name, IQ, salary, education, expectedOnDestroy, country);
    }


    public String getGender() {
        return gender;
    }

}

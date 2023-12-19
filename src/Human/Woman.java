package Human;

public class Woman extends Human {
    private String gender = "woman";

    public Woman(
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

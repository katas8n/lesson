package Human;
import Country.Country;

public class Woman extends Human {
    private String gender = "woman";

    public Woman(
        String name,
        int IQ,
        double salary,
        String education,
        int expectedOnDestroy,
        Country country
    ) {
        super(name, IQ, salary, education, expectedOnDestroy, country);
        this.setExpectedOnDestroy(90);
    }

    public String getGender() {
        return gender;
    }
}

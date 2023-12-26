package Country;

public class PoorCountry extends Country {
    public PoorCountry() {
        super(
            EnumCountry.POOR_ECOSYSTEM,
            EnumCountry.POOR_FINANCIAL_SYSTEM,
            "India"
        );
    }
}
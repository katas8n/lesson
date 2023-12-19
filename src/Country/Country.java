package Country;

public class Country {
    private String name ;
    private EnumCountry ecoSystem;
    private EnumCountry economics;

    public Country(EnumCountry ecoSystem, EnumCountry economics, String name) {
        this.name = name;
        this.ecoSystem = ecoSystem;
        this.economics = economics;
    }

    public EnumCountry getEcoSystem() {
        return ecoSystem;
    }

    public EnumCountry getEconomics() {
        return economics;
    }

    public String getName() {
        return name;
    }
}

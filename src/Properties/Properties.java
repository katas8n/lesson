package Properties;

public class Properties {
    private String name;
    private int cost;

    public Properties (String name, int cost) { 
        this.name = name;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}

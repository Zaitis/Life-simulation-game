package pl.painm;

public class ShopProducts {
    String name;
    int cost,energyRegen;

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getEnergyRegen() {
        return energyRegen;
    }

    ShopProducts(String name, int cost, int energyRegen){
        this.name=name;
        this.cost=cost;
        this.energyRegen=energyRegen;
    }
}

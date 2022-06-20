package at.fhj.msd;

public class SimpleDrink implements Drinks{

    /**
     * name of the drink
     */
    protected String name;

    @Override
    public void Drink(String name) {

    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    @Override
    public boolean isAlcoholic() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}

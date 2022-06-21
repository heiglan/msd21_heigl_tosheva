package at.fhj.msd;

public class SimpleDrink implements Drinks{

    /**
     * name of the drink
     */
    protected String name;

    /**
     * Creates a Drink object with given name
     *
     * @param name name of the drink
     *
     */
    @Override
    public void Drink(String name) {

    }

    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    @Override
    public double getVolume() {
        return 0;
    }

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        if (getAlcoholPercent()==0)
            return true;
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

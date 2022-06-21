package at.fhj.msd;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
/**
 * Class that implements a Queue.
 *
 */

public class SimpleDrink implements Drink{
    private List<String> elements = new ArrayList<String>();
    /**
     * uses only one liquid
     */
    protected Liquid l;
    /**
     * Creates a SimpleDrink object with given age and
     * liquid
     *
     * @param name name of drink
     * @param l only liquid in drink
     */
    SimpleDrink(String name, Liquid l){
       name=name;
        this.l = l;
    }

    @Override
    public void Drink(String name) {

    }

    /**
     * Returns volume of liquid l
     *
     * @return the volume of drink in litre
     */
    @Override
    public double getVolume() {
        return l.getVolume();
    }

    /**
     * Returns alcohol volume percent of liquid l
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }
    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        if(l.getAlcoholPercent() > 0){
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }
}

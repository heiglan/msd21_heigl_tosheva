package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * element method test
 * the expected result is compared with the result from the element method
 */


public class SimpleDrinkTest {

    private SimpleDrink simpleDrinkTest;
    private SimpleDrink simpleDrinkTest2;
    private Liquid l1;
    private Liquid l2;
    /**
     * set up method that sets the values for the tests
     */
    @BeforeEach
    public void setUp(){
        l1 = new Liquid("Cola", 0.2, 0.0);
        l2 = new Liquid("Rum", 0.25, 40.0);
        simpleDrinkTest = new SimpleDrink(l1.getName(), l1);
        simpleDrinkTest2 = new SimpleDrink(l2.getName(), l2);
    }
    /**
     * test the getVolume method by comparing expected result with the result of getVolume method from SimpleDrinks
     */
    @Test
    public void testGetVolume(){
        double result = l1.getVolume();
        double expectedResult = 0.2;
        Assertions.assertEquals(expectedResult,result);
    }
    /**
     * test the getVolume method by comparing expected result with the result of getVolume method from SimpleDrinks
     */
    @Test
    public void testGetVolume2(){
        double result = l2.getVolume();
        double expectedResult = 0.25;
        Assertions.assertEquals(expectedResult,result);
    }
    /**
     * test the getAlcoholPercent method by comparing expected result with the result of getAlcoholPercent method from SimpleDrinks
     */
    @Test
    public void testGetAlcoholPercent(){
        double result = l1.getAlcoholPercent();
        double expectedResult = 0.0;

        Assertions.assertEquals(expectedResult,result);
    }
    /**
     * test the getAlcoholPercent method by comparing expected result with the result of getAlcoholPercent method from SimpleDrinks
     */
    @Test
    public void testGetAlcoholPercent2(){
        double result = l2.getAlcoholPercent();
        double expectedResult = 40.0;

        Assertions.assertEquals(expectedResult,result);
    }
    /**
     * test if the drink is alcoholic by comparing expected result with the result of isAlcoholic from SimpleDrinks
     * with an nonAlcoholic drink
     */
    @Test
    public void testIsAlcoholic(){
        boolean result = simpleDrinkTest.isAlcoholic();
        boolean expectedResult = false;

        Assertions.assertEquals(expectedResult,result);
    }
    /**
     * test if the drink is alcoholic by comparing expected result with the result of isAlcoholic from SimpleDrinks
     * with alcoholic drink
     */
    @Test
    public void testIsAlcoholic2(){
        boolean result = simpleDrinkTest2.isAlcoholic();
        boolean expectedResult = true;

        Assertions.assertEquals(expectedResult,result);
    }
}

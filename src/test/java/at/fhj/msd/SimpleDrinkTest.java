package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class SimpleDrinkTest {

    private SimpleDrink simpleDrinkTest;
    private Liquid l1;
    @BeforeEach
    public void setUp(){
        l1 = new Liquid("Cola", 0.2, 0.0);
        simpleDrinkTest = new SimpleDrink("cola", l1);
    }
    @Test
    public void testGetVolume(){
        double result = l1.getVolume();
        double expectedResult = 0.2;
        Assertions.assertEquals(expectedResult,result);
    }
    @Test
    public void testGetAlcoholPercent(){
        double result = l1.getAlcoholPercent();
        double expectedResult = 0.0;

        Assertions.assertEquals(expectedResult,result);
    }
    @Test
    public void testIsAlcoholic(){
        boolean result = simpleDrinkTest.isAlcoholic();
        boolean expectedResult = false;

        Assertions.assertEquals(expectedResult,result);
    }
}

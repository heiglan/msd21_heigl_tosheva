package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Class that tests the Drink Queue implementation.
 *
 * @author Anzhelika Heigl
 * @author Ivana Tosheva Aleksoska
 */

public class DrinkQueueTest {

    private DrinkQueue drinkQueue;

    @BeforeEach
    public void setUp(){

        drinkQueue = new DrinkQueue(2);
    }

    @Test
    public void testOffer() {
        SimpleDrink drink1 = new SimpleDrink("Cola", new Liquid("Cola", 0.25, 0.0));
        SimpleDrink drink2 = new SimpleDrink("Rum", new Liquid("Rum", 0.1, 38.0));
        boolean expectedResult = true;
        boolean result = drinkQueue.offer(drink1);

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    public void testPool() {
        SimpleDrink drink = new SimpleDrink("Rum", new Liquid("Rum", 0.1, 38.0));
        drinkQueue.offer(drink);
        SimpleDrink result = drinkQueue.poll();
        SimpleDrink expectedResult = drink;

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    public void testRemove(){
        SimpleDrink drink = new SimpleDrink("Cola", new Liquid("Cola", 0.25, 0.0));
        drinkQueue.offer(drink);
        SimpleDrink result = drinkQueue.remove();
        SimpleDrink expectedResult = drink;

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    public void testPeek() {
        SimpleDrink drink = new SimpleDrink("Rum", new Liquid("Rum", 0.1, 38.0));
        drinkQueue.offer(drink);
        SimpleDrink result = drinkQueue.peek();
        SimpleDrink expectedResult = drink;

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    public void testElement(){
        SimpleDrink drink = new SimpleDrink("Cola", new Liquid("Cola", 0.25, 0.0));
        drinkQueue.offer(drink);
        SimpleDrink result = drinkQueue.element();
        SimpleDrink expectedResult = drink;

        Assertions.assertEquals(expectedResult,result);
    }

}

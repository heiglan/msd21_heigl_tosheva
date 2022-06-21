package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Class that tests the Drink Queue implementation.
 *
 * @author Anzhelika Heigl
 * @author Ivana Tosheva Aleksoska
 */

public class DrinkQueueTest {


    private DrinkQueue drinkQueue;

    /**
     * test the offer method
     */
    @BeforeEach
    public void setUp(){

        drinkQueue = new DrinkQueue(2);
    }
    /**
     * second test for the offer method
     * the expected result is compared with the result of the offer method from drinkQueue
     */
    @Test
    public void testOffer() {
        SimpleDrink drink1 = new SimpleDrink("Cola", new Liquid("Cola", 0.25, 0.0));
        SimpleDrink drink2 = new SimpleDrink("Rum", new Liquid("Rum", 0.1, 38.0));
        boolean expectedResult = true;
        boolean result = drinkQueue.offer(drink1);

        Assertions.assertEquals(expectedResult,result);
    }
    /**
     * second test for the offer method
     * the expected result is compared with the result of the offer method from drinkQueue with null
     */
    @Test
    public void testOffer2() {
        SimpleDrink drink1 = new SimpleDrink("Cola", new Liquid("Cola", 0.25, 0.0));
        SimpleDrink drink2 = new SimpleDrink("Rum", new Liquid("Rum", 0.1, 38.0));
        SimpleDrink drink3 = new SimpleDrink("Tonic", new Liquid("Tonic", 0.2, 0.0));
        SimpleDrink drink4 = new SimpleDrink("Gin", new Liquid("Gyn", 0.15, 30.0));
        boolean expectedResult = false;
        drinkQueue.offer(drink1);
        drinkQueue.offer(drink2);
        drinkQueue.offer(drink3);
        drinkQueue.offer(drink4);
        drinkQueue.offer(drink1);
        drinkQueue.offer(drink3);
        boolean result = drinkQueue.offer(drink4);

        Assertions.assertEquals(expectedResult,result);
    }
    /**
     * test for the pool method
     * the expected result is compared with the pool method from DrinkQueue
     */
    @Test
    public void testPool() {
        SimpleDrink drink = new SimpleDrink("Rum", new Liquid("Rum", 0.1, 38.0));
        drinkQueue.offer(drink);
        SimpleDrink result = drinkQueue.poll();
        SimpleDrink expectedResult = drink;

        Assertions.assertEquals(expectedResult,result);
    }
    /**
     * test for the remove method
     * the expected result is compared with the result fron the remove method in drinkQueue
     */
    @Test
    public void testRemove(){
        SimpleDrink drink = new SimpleDrink("Cola", new Liquid("Cola", 0.25, 0.0));
        drinkQueue.offer(drink);
        SimpleDrink result = drinkQueue.remove();
        SimpleDrink expectedResult = drink;

        Assertions.assertEquals(expectedResult,result);
    }
    /**
     * test for the remove method
     * the expected result is compared with the result fron the remove method in drinkQueue
     */
    @Test
    public void testRemove2(){
        assertThrows(NoSuchElementException.class, () -> {
            drinkQueue.remove();
        });
    }
    /**
     * peek method test
     * the expected result is compared with the result from the peek method
     */
    @Test
    public void testPeek() {
        SimpleDrink drink = new SimpleDrink("Rum", new Liquid("Rum", 0.1, 38.0));
        drinkQueue.offer(drink);
        SimpleDrink result = drinkQueue.peek();
        SimpleDrink expectedResult = drink;

        Assertions.assertEquals(expectedResult,result);
    }
    /**
     * element method test
     * the expected result is compared with the result from the element method in drinkQueue
     */
    @Test
    public void testElement(){
        SimpleDrink drink = new SimpleDrink("Cola", new Liquid("Cola", 0.25, 0.0));
        drinkQueue.offer(drink);
        SimpleDrink result = drinkQueue.element();
        SimpleDrink expectedResult = drink;

        Assertions.assertEquals(expectedResult,result);
    }
    /**
     * element method test
     * the expected result is compared with the result from the element method in drinkQueue with null
     */
    @Test
    public void testElement2(){
        assertThrows(NoSuchElementException.class, () -> {
            drinkQueue.element();
        });
    }
}

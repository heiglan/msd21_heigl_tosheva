package at.fhj.msd;
import java.util.Locale;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Class that tests the String Queue implementation.
 *
 * @author Anzhelika Heigl
 * @author Ivana Tosheva Aleksoska
 */
public class StringQueueTest {
    private StringQueue stringQueueTest;

    /**
     * set up method that sets the values for the tests
     */
    @BeforeEach
    public void setUp(){

        stringQueueTest = new StringQueue(5);
    }

    /**
     * test the offer method
     */
    @Test
    public void testOffer1() {
        String element = "one";
        String element2 = "two";

        boolean expectedResult = true;
        boolean result = stringQueueTest.offer(element);
        result = stringQueueTest.offer(element2);




        Assertions.assertEquals(expectedResult,result);
    }

    /**
     * second test for the offer method
     * the expected result is compared with the result of the offer method from stringQueue
     */
    @Test
    public void testOffer2() {

        String element = "one";
        String element2 = "two";
        String element3 = "three";
        String element4 = "four";
        String element5 = "five";
        String element6 = "six";
        boolean expectedResult = false;

        boolean result = stringQueueTest.offer(element);
        result = stringQueueTest.offer(element2);
        result = stringQueueTest.offer(element3);
        result = stringQueueTest.offer(element4);
        result = stringQueueTest.offer(element5);
        result = stringQueueTest.offer(element6);
        Assertions.assertEquals(expectedResult,result);
    }

    /**
     * test for the pool method
     * the expected result is compared with the pool method from stringQueue
     */
    @Test
    public void testPool(){

        String element = "one";
        stringQueueTest.offer((element));
        String result = stringQueueTest.poll();
        String expectedResult = "one";

        Assertions.assertEquals(expectedResult,result);
    }

    /**
     * test for the remove method
     * the expected result is compared with the result fron the remove method in stringQueue
     */
    @Test
    public void testRemove(){
        String element = "one";
        String element2 = "two";
        stringQueueTest.offer((element));
        stringQueueTest.offer(element2);
        String result = stringQueueTest.remove();
        String expectedResult = "one";

        Assertions.assertEquals(expectedResult,result);
    }

    /**
     * peek method test
     * the expected result is compared with the result from the peek method
     */
    @Test
    public void testPeek(){
        String element = "peek";
        stringQueueTest.offer((element));
        String result = stringQueueTest.peek();
        String expectedResult = "peek";

        Assertions.assertEquals(expectedResult,result);
    }
    /**
     * element method test
     * the expected result is compared with the result from the element method
     */
    @Test
    public void testElement(){
        String element = "element";
        stringQueueTest.offer((element));
        String result = stringQueueTest.element();

        String expectedResult= "element";

        Assertions.assertEquals(expectedResult,result);
    }
}

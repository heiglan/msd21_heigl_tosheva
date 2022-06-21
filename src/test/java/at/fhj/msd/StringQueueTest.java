package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringQueueTest {
    private StringQueue stringQueueTest;
    @BeforeEach
    public void setUp(){

        stringQueueTest = new StringQueue(5);
    }

    @Test
    public void testOffer1() {
        String element = "one";
        String element2 = "two";
        String element3 = "three";
        String element4 = "four";
        boolean expectedResult = true;
        boolean result = stringQueueTest.offer(element);

        Assertions.assertEquals(expectedResult,result);
    }
    @Test
    public void testOffer2() {
        String element = "one";
        String element2 = "two";
        boolean expectedResult = true;
        boolean result = stringQueueTest.offer(element);
    }
}

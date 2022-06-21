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

        boolean expectedResult = true;
        boolean result = stringQueueTest.offer(element);
        result = stringQueueTest.offer(element2);




        Assertions.assertEquals(expectedResult,result);
    }
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
    @Test
    public void testPool(){

        String element = "one";
        boolean offer = stringQueueTest.offer((element));
        String result = stringQueueTest.poll();
        String expectedResult = "one";

        Assertions.assertEquals(expectedResult,result);
    }
    @Test
    public void testRemove(){
        String element = "one";
        String element2 = "two";
        boolean offer = stringQueueTest.offer((element));
        boolean offer2 = stringQueueTest.offer(element2);
        String result = stringQueueTest.remove();
        String expectedResult = "one";

        Assertions.assertEquals(expectedResult,result);
    }
    @Test
    public void testPeek(){
        String element = "peek";
        boolean offer = stringQueueTest.offer((element));
        String result = stringQueueTest.peek();
        String expectedResult = "peek";

        Assertions.assertEquals(expectedResult,result);
    }
    @Test
    public void testElement(){
        String element = "element";
        boolean offer = stringQueueTest.offer((element));
        String result = stringQueueTest.element();

        String expectedResult= "element";
    }
}

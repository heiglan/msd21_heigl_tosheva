package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Class that implements a Queue.
 *
 */
public class DrinkQueue implements IDrinkQueue {
    private List<SimpleDrink> elements = new ArrayList<SimpleDrink>();
    private int maxSize = 5;


    public DrinkQueue(int maxsize) {
        maxSize = maxSize;
    }

    /**
     * <p>Adds an object to a queue, return.</p>
     *
     * @param obj added String
     * @return true if works, otherwise false
     */
    @Override
    public boolean offer(SimpleDrink obj) {
        if (elements.size() != maxSize)
            elements.add(obj);
        else
            return false;

        return true;
    }

    /**
     * <p>Returns and deletes the first element.</p>
     *
     * @return first element if exists, otherwise null
     */
    @Override
    public SimpleDrink poll() {
        SimpleDrink element = peek();

        if (elements.size() != 0) {
            elements.remove(0);
        }

        return element;
    }

    /**
     * <p>Returns and deletes the first element.</p>
     *
     * @throws NoSuchElementException if no element exists
     * @return first element if exists
     */
    @Override
    public SimpleDrink remove() {
        SimpleDrink element = poll();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    /**
     * <p>Returns the first element.</p>
     *
     * @return first element if exists, otherwise null
     */
    @Override
    public SimpleDrink peek() {
        SimpleDrink element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;

        return element;
    }


    /**
     * <p>Returns the first element.</p>
     *
     * @throws NoSuchElementException if no element exists
     * @return first element if exists
     */
    @Override
    public SimpleDrink element() {
        SimpleDrink element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }
}

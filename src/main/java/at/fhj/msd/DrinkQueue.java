package at.fhj.msd;


import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Class that implements a Queue.
 *
 */
public class DrinkQueue implements IDrinkQueue {

    /**
     * List of drinks
     *
     */
    private List<SimpleDrink> elements = new ArrayList<SimpleDrink>();

    /**
     * size of the list
     *
     */
    private int maxSize = 5;

    /**
     * Creates a DrinkQueue object with given maximum size
     *
     * @param maxsize maximus size of the list
     */
    public DrinkQueue(int maxsize) {
        maxSize = maxSize;
    }

    /**
     * Adds an object to a queue, return.
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
     * Returns and deletes the first element.
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
     * Returns and deletes the first element.
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
     * Returns the first element.
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
     * Returns the first element.
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

package at.fhj.msd;

import java.util.NoSuchElementException;

public interface IDrinkQueue {
    /**
     * Adds an object to a queue, return.
     *
     * @param obj added String
     * @return true if works, otherwise false
     */
    public abstract boolean offer(SimpleDrink obj);

    /**
     * Returns and deletes the first element.
     *
     * @return first element if exists, otherwise null
     */
    public abstract SimpleDrink poll();

    /**
     * Returns and deletes the first element.
     *
     * @throws NoSuchElementException if no element exists
     * @return first element if exists
     */
    public abstract SimpleDrink remove();

    /**
     * <p>Returns the first element.</p>
     *
     * @return first element if exists, otherwise null
     */
    public abstract SimpleDrink peek();

    /**
     * Returns the first element.
     *
     * @throws NoSuchElementException if no element exists
     * @return first element if exists
     */
    public abstract SimpleDrink element();
}
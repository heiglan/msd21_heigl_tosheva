package at.fhj.msd;

import java.util.NoSuchElementException;

/**
 * Class represents a queue
 */

public interface IQueue {
  /**
   * Adds an object to a queue, return.
   *
   * @param obj added String
   * @return true if works, otherwise false
   */
  public abstract boolean offer(String obj);

  /**
   * Returns and deletes the first element.
   *
   * @return first element if exists, otherwise null
   */
  public abstract String poll();

  /**
   * Returns and deletes the first element.
   *
   * @throws NoSuchElementException if no element exists
   * @return first element if exists
   */
  public abstract String remove();

  /**
   * <p>Returns the first element.</p>
   *
   * @return first element if exists, otherwise null
   */
  public abstract String peek();

  /**
   * Returns the first element.
   *
   * @throws NoSuchElementException if no element exists
   * @return first element if exists
   */
  public abstract String element();
}
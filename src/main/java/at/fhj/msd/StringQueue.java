package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

/**
 * Class that implements a Queue.
 *
 */

public class StringQueue implements IQueue {

  private List<String> elements = new ArrayList<String>();
  private int maxSize = 5;


  public StringQueue(int maxsize) {
    maxSize = maxSize;
  }

  /**
   * <p>Adds an object to a queue, return.</p>
   *
   * @param obj added String
   * @return true if works, otherwise false
   */
  @Override
  public boolean offer(String obj) {
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
  public String poll() {
    String element = peek();

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
  public String remove() {
    String element = poll();
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
  public String peek() {
    String element;
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
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}
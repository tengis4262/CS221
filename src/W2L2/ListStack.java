/*<listing chapter="3" number="4">*/
package W2L2;

import java.util.List;
import java.util.ArrayList;
import java.util.EmptyStackException;

/** Class ListStack<E> implements the interface StackInt<E> as
 *  an adapter to the List. This implementation is functionally
 *  equivalent to that given in java.util.Stack<E> except that the
 *  underlying List<E> is not publicly exposed.
 *  @author Koffman & Wolfgang
 */
public class ListStack<E> implements StackInt<E> {

    /** The List containing the data */
    private List<E> theData;

    /**
     * Construct an empty stack using an ArrayList as the
     * container.
     */
    public ListStack() {
        theData = new ArrayList<E>();
    }

    /**
     * Push an object onto the stack.
     * @post The object is at the top of the stack.
     * @param obj The object to be pushed
     * @return The object pushed
     */
    @Override
    public E push(E obj) {
        theData.add(obj);
        return obj;
              
    }

    /**
     * Peek at the top object on the stack.
     * @return The top object on the stack
     * @throws EmptyStackException if the stack is empty
     */
    @Override
    public E peek() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return theData.get(theData.size() - 1);
    }

    /**
     * Pop the top object off the stack.
     * @post The object at the top of the stack is removed.
     * @return The top object, which is removed
     * @throws EmptyStackException if the stack is empty
     */
    @Override
    public E pop() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return theData.remove(theData.size() - 1);
    }

    /**
     * See whether the stack is empty.
     * @return true if the stack is empty
     */
    @Override
    public boolean empty() {
        return theData.size() == 0;
    }

    @Override
    public int size() {
        return 0;
    }

    public static void main(String args[]){
    	ListStack<Integer> ai = new ListStack<>();
    	ai.push(10);
    	ai.push(20);
    	ai.push(30);
    	ai.push(40);
    	ai.push(50);
    	System.out.println("List of Elements " + ai.theData);
    	System.out.println("Stack Size : " + ai.theData.size());
    	System.out.println("Peek Element :" + ai.peek());
    	while(!ai.empty())
    		System.out.println(ai.pop());
    }
}
/*</listing>*/

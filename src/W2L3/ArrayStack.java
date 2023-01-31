/*<listing chapter="3" section="3">*/
package W2L3;

import java.util.Arrays;
import java.util.EmptyStackException;

/** Implementation of the interface StackInt<E> using
 *  an array.
 *  @author Koffman & Wolfgang
 */
public class ArrayStack<E> implements StackInt<E> {

    // Data Fields
    /** Storage for stack. */
    E[] theData;
    /** Index to top of stack. */
    int topOfStack = -1; // Initially empty stack.
    private static final int INITIAL_CAPACITY = 10;

    /**
     * Construct an empty stack with the default
     * initial capacity.
     */
    public ArrayStack() {
        theData = (E[]) new Object[INITIAL_CAPACITY];
    }

    /**
     * Insert a new item on top of the stack.
     * @post The new item is the top item on the stack.
     *       All other items are one position lower.
     * @param obj The item to be inserted
     * @return The item that was inserted
     */
    @Override
    public E push(E obj) {
        if (topOfStack == theData.length - 1) {
            reallocate();
        }
        topOfStack++;
        theData[topOfStack] = obj;
        return obj;
    }

    /**
     * Remove and return the top item on the stack.
     * @pre The stack is not empty.
     * @post The top item on the stack has been
     *       removed and the stack is one item smaller.
     * @return The top item on the stack
     * @throws EmptyStackException if the stack is empty
     */
    @Override
    public E pop() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return theData[topOfStack--]; // E del = theData[topOfStack]; topofStack--; return del;
    }

    /*<exercise chapter="3" section="3" type="programming" number="2">*/
    /**
     * Return the top item on the stack
     * Pre: The stack is not empty
     * Post: The stack remains unchanged
     * @return The top item on the stack
     * @throws EmptyStackException If the stack
     *         is empty
     */
    @Override
    public E peek() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return theData[topOfStack];
    }

    /**
     * Return true if the stack is empty
     * @return True if the stack is empty
     */
    @Override
    public boolean empty() {
        return topOfStack == -1; // if(topOfStack==-1) return true; else return false;
    }

    /**
     * Method to reallocate the array containing the stack data
     * @post The size of the data array has been doubled
     *       and all of the data has been copied to the new array
     */
    private void reallocate() {
         	    theData = Arrays.copyOf(theData, 2 * theData.length);
    }
    @Override
	public int size() {
		// TODO Auto-generated method stub
		return topOfStack+1;
	}
    /*</exercise>*/
    public static void main(String args[]){
    	ArrayStack<Integer> ai = new ArrayStack<>();
    	ai.push(10);
    	ai.push(20);
    	ai.push(30);
    	ai.push(40);
    	ai.push(50);
    	ai.push(60);
    	System.out.println("Size  = " + ai.size());
    	ai.pop();// 60
    	System.out.println("Peek Element :" + ai.peek()); //50
    	
    	System.out.println(ai.empty()); // false
    	while(!ai.empty())
    		System.out.println(ai.pop());//   50  40  30  20 10 
    	
    	System.out.println(ai.empty()); // true
    	
    	ArrayStack<Float> a1 = new ArrayStack<>();
    	a1.push(10.5f);
    	a1.push(20.5f);
    	a1.push(30.5f);
    	a1.push(40.5f);
    	a1.push(50.5f);
    	a1.push(60.5f);
    	System.out.println("Peek Element :" + a1.peek()); // 60.5
    	
    }

	
   
    
}
/*</listing>*/

/** This imports java arrays so that
 * they can be used and manipulated 
 * within this class and its methods.
 * 
 */
import java.util.Arrays;

/** 
 * 
 * @author morganhardin
 *
 * @param <T>
 */
public class Shopping_Cart_Implemented_MEH<T>
{
	/** This instantiates a private instance
	 * of the CartBag class that implements
	 * the CarBat_Interface. It also is generic
	 * so that when it is instantiated in a 
	 * main method any data type can be used.
	 * 
	 */
	private CartBag_Interface<T> Cart = new CartBag<>();
	
	/** This package method calls CartBag and
	 * its getCurrentSize method. It will then
	 * return an integer representing the size
	 * of the cart at that instance.
	 * 
	 * @return
	 */
	int getCurrentSize()
	{
		return Cart.getCurrentSize();
	}
	
	/** This package method calls CartBag and
	 * its isEmpty method. It tests whether the
	 * cart is empty at a certain point in the
	 * main method and will return true if it is
	 * empty and false if it is not empty.
	 * 
	 * @return
	 */
	boolean isEmpty()
	{
		return Cart.isEmpty();
	}
	
	/** This package method calls CartBag and its
	 * addItem interface. It as a generic parameter
	 * item that will then be used to add that item 
	 * to the Linked List in CartBag_Interface. It 
	 * will return true if the item was successfully
	 * added and false if the item was not added to
	 * the Linked List.
	 * 
	 * @param item
	 * @return
	 */
	boolean addItem(T item)
	{
		return Cart.addItem(item);
	}
	
	/** This package method calls CartBag and
	 * its removeItem method. There are no
	 * parameters on this method so it will 
	 * remove the last item added to the 
	 * Linked List (or first item). It will
	 * return the generic object that was
	 * removed (data type depends on the
	 * instance in main method).
	 * 
	 * @return
	 */
	T removeItem()
	{
		return (T) Cart.removeItem();
	}
	
	/** This package method calls CartBag and its
	 * removeItem(T item) method. This is different
	 * than the previous method since it has the generic
	 * parameter item. It will search the Linked List
	 * for that specific item and will make it null,
	 * removing it from the list. It will then
	 * return true if the item was successfully 
	 * removed and false if it was not removed.
	 * 
	 * @param item
	 * @return
	 */
	boolean removeItem(T item)
	{
		return Cart.removeItem(item);
	}
	
	/** This package method calls CartBag and
	 * its clearCart method. This method is
	 * void so there is no return type. By calling
	 * CartBag, it will clear all the objects
	 * from the Linked List. This means the Linked
	 * List will become completely empty.
	 * 
	 */
	void clearCart()
	{
		Cart.clearCart();
	}
	
	/** This package method calls CartBag and
	 * its getFrequencyOf(T item) method. This has
	 * a generic parameter item. When the method is
	 * called, it will use the parameter to search
	 * the Linked List for the specific item. It 
	 * will count how many times that item is
	 * in the Linked List and will return that
	 * number as an integer.
	 * 
	 * @param item
	 * @return
	 */
	int getFrequencyOf(T item)
	{
		return Cart.getFrequencyOf(item);
	}
	
	/** This package method calls CartBag and
	 * its containsItem(T item) method. It has
	 * a generic parameter item. When the method
	 * is called, it will search the Linked List
	 * for the parameter item. If the item is 
	 * found, the method will stop and will print
	 * true. If it is not found, it will have looped
	 * through the whole Linked List (not finding
	 * item) and will return false.
	 * 
	 * @param item
	 * @return
	 */
	boolean containsItem(T item)
	{
		return Cart.containsItem(item);
	}
	
	/** This private method cast the array
	 * as object and calls the toArray 
	 * method in the CartBag class. This 
	 * turns the LinkedList into an Array
	 * so that is can be returned in the main
	 * method (as a string with the toString
	 * method).
	 * 
	 * @return
	 */
	private T[] toArray()
	{
		return (T[]) Cart.toArray();
	}
	
	/** This public method turns the
	 * Array in this class (method above)
	 * into a string to that it can be 
	 * printed and returned in the
	 * main method. This will return all
	 * the values in the Linked List that
	 * have been added.
	 * 
	 */
	public String toString()
	{
		return "" + Arrays.toString(toArray());
	}
}

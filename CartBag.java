/** This imports java arrays so that
 * they can be used and manipulated 
 * within this class and its methods.
 * 
 */
import java.util.Arrays;

/**
    A class of bags whose entries are stored in a chain of linked nodes.
    The bag is never full.
    INCOMPLETE DEFINITION; includes definitions for the methods add,
    toArray, isEmpty, and getCurrentSize.
    @author Frank M. Carrano, Timothy M. Henry
    @version 5.0
*/
/** 
 * EDITED
 * @author morganhardin
 *
 * @param <T>
 */
public final class CartBag<T> implements CartBag_Interface<T>
{
	/** These private variables will be used
	 * in this class so that they can be
	 * instantiated and manipulated.
	 * 
	 */
	private Node firstNode;       // Reference to first node
	private int numberOfEntries;

	public CartBag()
	{
		firstNode = null;
		numberOfEntries = 0;
	} // end default constructor

	/** Adds a new entry to this bag.
	    @param newEntry  The object to be added as a new entry.
	    @return  True. */
	public boolean addItem(T newEntry) // OutOfMemoryError possible
	{
      // Add to beginning of chain:
		Node newNode = new Node(newEntry);
		newNode.next = firstNode;  // Make new node reference rest of chain
                                 // (firstNode is null if chain is empty)
		firstNode = newNode;       // New node is at beginning of chain
		numberOfEntries++;
      
		return true;
	} // end add

	/** Retrieves all entries that are in this bag.
       @return  A newly allocated array of all the entries in this bag. */
	public T[] toArray()
	{
      // The cast is safe because the new array contains null entries.
      @SuppressWarnings("unchecked")
      T[] result = (T[])new Object[numberOfEntries]; // Unchecked cast
      
      int index = 0;
      Node currentNode = firstNode;
      while ((index < numberOfEntries) && (currentNode != null))
      {
         result[index] = currentNode.data;
         index++;
         currentNode = currentNode.next;
      } // end while
      
      return result;
      // Note: The body of this method could consist of one return statement,
      // if you call Arrays.copyOf
	} // end toArray
   
	/** Sees whether this bag is empty.
       @return  True if the bag is empty, or false if not. */
	public boolean isEmpty()
	{
		if (firstNode == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	} // end isEmpty
   
	/** Gets the number of entries currently in this bag.
       @return  The integer number of entries currently in the bag. */
	public int getCurrentSize()
	{
		return numberOfEntries;
	} // end getCurrentSize
   
// STUBS:

	/** Removes one unspecified entry from this bag, if possible.
       @return  Either the removed entry, if the removal
                was successful, or null. */
	public T removeItem()
	{
		T result = null;
		if (firstNode != null)
		{
			result = firstNode.data;
			firstNode = firstNode.next;
			numberOfEntries--;
		}
		return result;
	} // end remove
   
	/** Removes one occurrence of a given entry from this bag.
       @param anEntry  The entry to be removed.
       @return  True if the removal was successful, or false otherwise. */
   public boolean removeItem(T anEntry)
   {
	   	boolean found = false;
		Node currentNode = firstNode;
		while (!found && (currentNode != null))
		{
			if (anEntry.equals(currentNode.data))
			{
				currentNode.data = null;
				currentNode = currentNode.next;
				found = true;
			}
			else
			{
				currentNode = currentNode.next;
			}
		}
		return found;
   } // end remove
	
	/** Removes all entries from this bag. */
	public void clearCart()
	{
		while (!isEmpty())
		{
			removeItem();
		}
	} // end clear
	
	/** Counts the number of times a given entry appears in this bag.
		 @param anEntry  The entry to be counted.
		 @return  The number of times anEntry appears in the bag. */
	public int getFrequencyOf(T anEntry)
	{
		int frequency = 0;
		int loopCounter = 0;
		Node currentNode = firstNode;
		while ((loopCounter < numberOfEntries) && (currentNode != null))
		{
			if (anEntry.equals(currentNode.data))
			{
				frequency++;
			}
			loopCounter++;
			currentNode = currentNode.next;
		}
		return frequency;
	} // end getFrequencyOf
	
	/** Tests whether this bag contains a given entry.
		 @param anEntry  The entry to locate.
		 @return  True if the bag contains anEntry, or false otherwise. */
	public boolean containsItem(T anEntry)
	{
		boolean found = false;
		Node currentNode = firstNode;
		while (!found && (currentNode != null))
		{
			if (anEntry.equals(currentNode.data))
			{
				found = true;
			}
			else
			{
				currentNode = currentNode.next;
			}
		}
		return found;
	} // end contains

	/** This private Node class creates the
	 * Node that will inputted into the Linked
	 * List.
	 * 
	 * @author morganhardin
	 *
	 */
	private class Node
	{
		/** These private variables will be
		 * used to make generic data a Node
		 * that will go into the Linked List.
		 * It will also point to the next Node.
		 * 
		 */
		private T data; // Entry in bag
		private Node next; // Link to next node
		
		/** This private Node constructor takes 
		 * a generic parameter and sets it equal 
		 * to null.
		 * 
		 */
		private Node(T dataPortion)
		{
			this(dataPortion, null);	
		} // end constructor
		
		/** This private Node constructor takes
		 * two generic parameters and sets them
		 * equal to there Node counterpart so that
		 * they can be used in the Linked List.
		 * 
		 * @param dataPortion
		 * @param nextNode
		 */
		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;	
		} // end constructor
	} // end Node

	@Override
	public String toString() 
	{
		return "" + Arrays.toString(toArray());
	}
} // end LinkedBag1
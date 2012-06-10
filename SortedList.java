package sky.engine.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * An implementation of a Sorted List, which extends ArrayList. It is constructed using a Comparator
 * object that can compare two objects together, thus allowing the SortedList to order its elements
 * into ascending or descending order.
 * 
 * @author Matthew Kelly (Badgerati).
 * 
 * @param <T> - Class type for the objects to be sorted.
 *
 */
public class SortedList<T> extends ArrayList<T>
{
	/**
	 * Serial ID.
	 */
	private static final long serialVersionUID = -6558751495198829074L;
	
	
	/**
	 * The Comparator object to use when sorting the SortedList.
	 */
	private final Comparator<T> comparator;
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Create new instance of a SortedList. Objects will be sorted in ascending order,
	 * according to the given Comparator.
	 * 
	 * @param comp - Comparator to sort the objects by.
	 */
	public SortedList(Comparator<T> comp)
	{
		comparator = comp;
	}
	
	
	
	
	
	
	

	
	
	/**
	 * This method is unsupported.
	 */
	@Override
	public void add(int index, T object)
	{
		throw new UnsupportedOperationException();
	}






	



	/**
	 * Add the given object to the SortedList. The object will be added, and then the List sorted
	 * into ascending order so the object is placed into the correct position.
	 * 
	 * @param object - The object to be added.
	 * @return Whether the operation was successful.
	 */
	@Override
	public boolean add(T object)
	{
		boolean passed = super.add(object);
		sortAscending();
		return passed;
	}
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Adds an entire collection to the SortedList. The collection is first added, and the List
	 * then sorted into ascending order so everything is placed correctly.
	 * 
	 * @param collection - The collection of object to be added.
	 * @return Whether the operation was successful.
	 */
	@Override
	public boolean addAll(Collection<? extends T> collection)
	{
		boolean passed = super.addAll(collection);
		sortAscending();
		return passed;
	}










	/**
	 * This method is unsupported.
	 */
	@Override
	public boolean addAll(int index, Collection<? extends T> collection)
	{
		throw new UnsupportedOperationException();
	}







	



	/**
	 * Set an object at the given index to the given object. When the object has been set
	 * the List will be re-sorted into ascending order.
	 * 
	 * @param index - Index of the object to set.
	 * @param object - Object to set the other object to.
	 * @return The previous object at the given index.
	 */
	@Override
	public T set(int index, T object)
	{
		T temp = super.set(index, object);
		sortAscending();
		return temp;
	}








	

	/**
	 * Sort the elements into ascending order.
	 */
	public void sortAscending()
	{
		Collections.sort(this, comparator);
	}
	
	
	
	
	
	
	
	
	
	
	/**
	 * Sort the elements into descending order.
	 */
	public void sortDescending()
	{
		Collections.sort(this, Collections.reverseOrder(comparator));
	}
	
	
	
	
}

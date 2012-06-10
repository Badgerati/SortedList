SortedList
==========

An implementation of a Sorted List, which extends ArrayList. It is constructed using a Comparator
object that can compare two objects together, thus allowing the SortedList to order its elements
into ascending or descending order.

We can also create a SortedList without a Comparator object, if and only if the objects to be
used implement the Comparable interface.



Usage
-----

We create a SortedList as we would any ArrayList within Java:

	SortedList<Integer> sortedlist = new SortedList<Integer>(comparator);

Where `comparator` is some Comparator object for comparing Integers. Conversely, if we know for a fact the objects
we are about to deal with implement the Comparable interface, then we can use:

	SortedList<Integer> sortedlist = new SortedList<Integer>();

This means we now no longer have to need to create Comparator objects all of the time. To add an object to the
SortedList we can use the add method:

	int i = 5;
	sortedlist.add(i);

When an object gets added, the SortedList automatically sorts the List into ascending order after inserting
the given object. If required, we can also sort the List into descending order like so:

	sortedlist.sortDescending();
	
	//or vice-versa,
	
	sortedlist.sortAscending();

In general, a SortedList will always sort into ascending order.

Finally, the methods

	add(int index, T object)
	addAll(int index, Collection<? extends T> collection)

Are unsupported, and will throw an `UnsupportedOperaetionException` if used.
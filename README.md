SortedList
==========

An implementation of a Sorted List, which extends ArrayList. It is constructed using a Comparator
object that can compare two objects together, thus allowing the SortedList to order its elements
into ascending or descending order.



Usage
-----

We create a SortedList as we would any ArrayList within Java:

	SortedList<Integer> sortedlist = new SortedList<Integer>(comparator);

Where `comparator` is some Comparator object for comparing Integers. To add an object to the SortedList
we can use the add method:

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
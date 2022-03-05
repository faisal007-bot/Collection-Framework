package collection;

//import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {
	public static void main(String[] args) {
//		underlying datastructure for linkedlist is doubly linkedlist datastructure
//		it is non synchronized
//		it allows multiple null values and duplicate values 
//		it maintains insertion order
//		it implements the list interface and deque interface
//		better for data manipulation worst for data retrieval
		
//		constructors of Linkedlist
		
//		creating an empty linkedlist object
//		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		
//		creating an linkedlist object by using the provided collection
//		LinkedList<Integer> ll2 = new LinkedList<Integer>(ll1);
		
//		all other methods are inherited from list and collection interface
		
//		adding some elements to perform operations
		LinkedList<Integer> ll = new LinkedList<Integer>();
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		ll1.add(7);ll1.add(87);ll1.add(6);ll1.add(3);ll1.add(1);ll1.add(3);
		ll.add(57);ll.add(8);ll.add(46);ll.add(6);ll.add(46);ll.add(57);
		ll.addAll(ll1);
//		System.out.println(ll);
		
//		methods of the linkedlist
		
//		addfirst method adds the element at the start
//		ll.addFirst(56);
//		System.out.println(ll);
		
//		addlast method adds the element at the end
//		ll.addLast(78);
//		System.out.println(ll);
		
//		descendingIterator returns the iterator in the reverse order
//		it points to the last element present in the collection
//		Iterator<Integer> ditr = ll.descendingIterator();
//		while(ditr.hasNext()) {
//			System.out.print(ditr.next()+" ");
//		}
		
//		getFirst returns the element present at the start of the collection
//		Integer first = ll.getFirst();
//		System.out.println("first element = "+first);
		
//		getLast returns the element present at the end of the collection
//		Integer last = ll.getLast();
//		System.out.println("last element = "+last);
		
//		offerfirst adds the element at the start of the collection
//		ll.offerFirst(1);
		
//		offerLast adds the element at the end of the collection
//		ll.offerLast(100);
		
//		it returns the element present at the start of the collection
//		Integer peekFirst = ll.peekFirst();
//		System.out.println(peekFirst);
		
//		it returns the element present at the end of the collection
//		Integer peekLast = ll.peekLast();
//		System.out.println(peekLast);
		
//		ll.pollFirst();
		
//		it removes the element present at the end of the collection
//		ll.pollLast();
		
//		it removes the element present at the start of the collection
//		ll.pop();
		
//		it adds the element at the start of the collection
//		ll.push(999);
		
//		it removes the element present at the start of the collection
//		ll.removeFirst();
		
//		it removes the element present at the end of the collection
//		ll.removeLast();
		
//		it removes the first element that matches with the provided element
//		ll.removeFirstOccurrence(46);
		
//		it removes the last element that matches with the provided element
//		ll.removeLastOccurrence(46);
//		System.out.println(ll);
	}
}

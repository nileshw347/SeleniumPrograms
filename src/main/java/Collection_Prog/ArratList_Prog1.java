package Collection_Prog;

import java.util.ArrayList;
import java.util.Collections;

public class ArratList_Prog1 {

	public static void main(String[] args) {
	 	ArrayList Al1 = new ArrayList();      //initial capacity/default capacity is 10
	 	ArrayList Al2 = new ArrayList(100);   //initial capacity is 100
	 	ArrayList Al3 = new ArrayList(Al1);
	 	
	 	Al1.add("Nilesh");
	 	Al1.add("Wankhede");
	 	Al1.add("9359067461");
	 	Al1.add(786);
	 	Al1.add(null);
	 	System.out.println("ArrayList 1 = " + Al1);
	 	System.out.println("Size of ArrayList 1 = " + Al1.size());
	 	System.out.println("Index of 'Wankhede' = " + Al1.indexOf("Wankhede"));
	 	
	 	System.out.println("--------------------");
	 	System.out.println("This is for Loop");
	 	for(int i=0;i<Al1.size();i++)
	 		System.out.println(Al1.get(i));
	 	System.out.println("--------------------");
	 	
	 	Al2.add(25);
	 	Al2.add("Aurangabad");
	 	Al2.add(null);
	 	System.out.println("ArrayList 2 = " + Al2);
	 	System.out.println("--------------------");
	 	Al1.addAll(2, Al2);
	 	System.out.println(Al1);
	 	System.out.println("--------------------");
	 	System.out.println("this is index 3 value = " + Al1.get(3));
	 	System.out.println("--------------------");
	 	System.out.println("Last index of '786' = " + Al1.lastIndexOf(786));
	 	System.out.println("--------------------");
	 	Al1.set(2, 1234);
	 	System.out.println(Al1);
	 	System.out.println("--------------------");
	 	Al3.add(20);
	 	System.out.println("Al3 is empty = " + Al3.isEmpty());
	 	System.out.println("Al3 size = " + Al3.size());
	 	System.out.println("Al3 = " + Al3);
	 	System.out.println("--------------------");
	 	
	 	Collections.reverse(Al1);
	 	System.out.println("Reverse method = " + Al1);
	 	Al1.remove(3);
	 	System.out.println("Remove null on index 3 = " + Al1);
	 	
	}
}

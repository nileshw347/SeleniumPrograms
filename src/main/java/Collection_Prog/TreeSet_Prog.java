package Collection_Prog;

import java.util.TreeSet;

public class TreeSet_Prog {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();        //Default capacity is 16
		TreeSet ts1 = new TreeSet();
		TreeSet ts2 = new TreeSet();
		
		
		//The insertion order is Acceding
		//Null not Allowed
		//Data Structure = Balanced Tree
		ts.add("A");
		ts.add("V");
		ts.add("B");
		ts.add("H");
		ts.add("K");
		ts.add("T");
		ts.add("O");
		System.out.println("TS = " + ts);  
//		ts.add(null);                      //TreeSet follow Homogeneous that's why it does not accept null value
//		System.out.println("TS = " + ts);  //Null pointer exception
		
//		ts.add(10);
//		System.out.println("TS = " + ts);  //Class Cast Exception
		
		//Multiple values are not allowed
		ts1.add(10);
		ts1.add(50);
		ts1.add(90);
		ts1.add(20);
		ts1.add(30);
		ts1.add(10);
		System.out.println("TS1 = " + ts1);
		
//		ts2.add(null);                     //Null value not Allowed
//		System.out.println(ts2);
		
		System.out.println("First element of TS1 = " + ts1.first()); //Getting first element
		System.out.println("Last element of TS1 = " + ts1.last());   //Getting last element
		ts1.pollFirst();                                             //Remove first element 
		ts1.pollLast();                                              //Remove last element
		System.out.println("TS1 = " + ts1);
		
	}
}

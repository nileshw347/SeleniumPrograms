package Collection_Prog;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector_Prog1 {

	public static void main(String[] args) {
		Vector v1 = new Vector();              //initial capacity/default capacity is 10
		Vector v2 = new Vector(100);           //initial capacity is 100 and increment by double(100x2)
		Vector v3 = new Vector(10,20);       //initial capacity, Increment capacity(10+20=30)
		Vector v4 = new Vector(v1);
		 
	
		System.out.println("Size of V1 = " + v1.size());           //0
		System.out.println("Capacity of V1 = " + v1.capacity());   //10
		System.out.println("Capacity of V2 = " + v2.capacity());   //100
		System.out.println("Capacity of v3 = " + v3.capacity());   //10
		System.out.println("Capacity of V4 = " + v4.capacity());   //0
		
//		------------------------------------------------------------------------
		for(int i=0;i<=10;i++)
			v1.add(i);
		System.out.println("V1 = " + v1);
		System.out.println("Capacity of V1 = " + v1.capacity());   //20 (current capacity x2)
		
		System.out.println("This is Enumaration Cursor");
		Enumeration e = v1.elements();
		while(e.hasMoreElements())
		{                                                          //This is For Printing loop 0-10
			System.out.println(e.nextElement());
		}
//		-------------------------------------------------------------------------
		for(int j=0;j<=10;j++)
			v3.add(j);
		System.out.println("V3 = " + v3);
		System.out.println("Capacity of V3 = " + v3.capacity());   //30 (10+20=30)
		
		System.out.println("This is Iterator Cursor");
		Iterator itr = v3.iterator();
//		while(itr.hasNext())
//		{                                                          //This is for Printing loop 0-10
//			System.out.println(itr.next());
//		}
		while(itr.hasNext())                                       //This is for Printing Even numbers
		{
			int ele = (Integer) itr.next();
			if(ele%2==0)
			{
			System.out.println(ele);
			}
			else
			{
				itr.remove();                     //If it contain Odd numbers then Remove All Odd numbers
			}
		}
//		-------------------------------------------------------------------------
		v1.add(12);
		v1.addElement(22);
		v1.addElement(null);
		v1.addElement(25);
		v1.add(null);
		System.out.println("V1 = " + v1);   //Vector has some old methods which works same as new methods
		v1.remove(5);                       //This method remove index
		v1.removeElement(10);               //this method remove element 
		System.out.println("V1 = " + v1); 
				
		System.out.println("Element at index 5 = " + v1.get(5));         //new
		System.out.println("Element at index 10 = " + v1.elementAt(10)); //old
		System.out.println("First Element = " + v1.firstElement());
		System.out.println("Last Element = " + v1.lastElement());
				
		v1.set(0, 1111);                      //index, value (Replace value at index 0)
		System.out.println("V1 = " + v1);     //New
		v1.setElementAt(1111, 3);             //Value, Index (Replace value at index 3)
		System.out.println("V1 = " + v1);     //Old
//	    -------------------------------------------------------------------------
		Collections.reverse(v1);
		System.out.println("Reverse v1 = " + v1);
//		Collections.sort(v1);
//		System.out.println("Sorting V1 = " + v1); //Can't sort Null
//		-------------------------------------------------------------------------
		
		
	}
}

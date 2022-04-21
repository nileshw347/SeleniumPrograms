package Collection_Prog;

import java.util.LinkedHashSet;

public class LinkedHashSet_Prog1 {

	public static void main(String[] args) {
		LinkedHashSet lhs1 = new LinkedHashSet();      //Initial capacity is 16
		LinkedHashSet lhs2 = new LinkedHashSet(lhs1);
		
		// Order of Insertion is Maintain
		//Duplicates are not Allowed
		
		lhs1.add("A");
		lhs1.add("C");
		lhs1.add("Z");
		lhs1.add("C");
		lhs1.add("B");
		lhs1.add(null);
		System.out.println("LHS1 = " + lhs1);
		System.out.println("Size of LHS1 = " + lhs1.size());
		
	}
}

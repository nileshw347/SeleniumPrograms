package Collection_Prog;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSet_Prog1 {

	public static void main(String[] args) {
		HashSet hs1 = new HashSet();      //IC = 16 & Load factor is 0.75=75% (16+16=32)
		HashSet hs2 = new HashSet(100);   //IC = 100 & Load factor is 0.75=75% (100+100=200)
		HashSet hs3 = new HashSet(10,90); //IC = 10 & Load factor is 0.90=90%
		
		// Order of Insertion is not Maintain
		//Duplicates are not Allowed
		
		hs1.add("Automation");
		hs1.add("Berlin");
		hs1.add("cat");
		hs1.add("dog");
		hs1.add("12");
		hs1.add(25);
		hs1.add("20");
		hs1.add(19);
		hs1.add("automation");
		hs1.add("Automation");
		System.out.println("HS1 = " + hs1);
		
		hs2.add("geeks");
		hs2.add("practice");
		hs2.add("contribute");
		hs2.add("ide");
        System.out.println("HS2 = " + hs2);
        
//      TreeSet method is use to sorting Elements  
        TreeSet treeSet = new TreeSet(hs2);
        System.out.println("Sorting of elements in HS2 = " + treeSet);
	}
}

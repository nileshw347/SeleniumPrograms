package Collection_Prog;
import java.util.LinkedList;


public class LinkedList_Prog1 {

	public static void main(String[] args) {
		LinkedList LL1 = new LinkedList();         //No initial/Default capacity
		LinkedList LL2 = new LinkedList(LL1);
		
		System.out.println("LL1 size = " + LL1.size());
		System.out.println("Is LL1 empty = " + LL1.isEmpty());
		
		LL1.add("Tokyo");
		LL1.add("Rio");
		LL1.add("Moscow");
		LL1.add('+');
		LL1.add(785);
		LL1.add(45);
		System.out.println("LL1 Contains = " + LL1);
		LL1.addFirst("Berlin");
		System.out.println("LL1 Contains = " + LL1);
		LL1.addLast("Nairobi");
		System.out.println("LL1 Contains = " + LL1);
		
		System.out.println("LL1 Contains '+' = " + LL1.contains('+'));
		System.out.println("Index Of Berlin = " + LL1.indexOf("Berlin"));
		
		System.out.println("First Element = " + LL1.getFirst());
		System.out.println("Last Element = " + LL1.getLast());
		
		LL1.pollFirst();     //Remove first element
		LL1.pollLast();      //Remove last element
		LL1.poll();          //Remove first element 
		System.out.println("LL1 Contains = " + LL1);
		
		LL1.removeFirst();
		LL1.removeLast();
		System.out.println("LL1 Contains = " + LL1);
		
		LL1.add("Helsinki");
		LL1.add("Arthuro");
		LL1.add("Helsinki");
		System.out.println("LL1 Contains = " + LL1);
		
		LL1.removeFirstOccurrence("Helsinki");
		System.out.println("LL1 Contains = " + LL1);
		
		LL1.add(0, "Prof");   //can add on selected index
		System.out.println("LL1 Contains = " + LL1);
		
		LL1.set(0, "Professor");    //We can edit index value/can change value
		System.out.println("LL1 Contains = " + LL1);
		
		
		
	}
}

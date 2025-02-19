package collection;
import java.util.LinkedList;

public class linkedList {
	public static void main(String args []) {
		LinkedList<String> list = new LinkedList<>();
		list.addFirst("yazan");//method to add first
		list.add("ali");//method to add last
		list.add("mohammed");//method to add last
		list.addLast("yazan");//method to add last
		list.add(2, "jamel");// method add someWhere  between 
		System.out.println(list);
	
	    for(int i = 0; i < list.size(); i++) {
	    	System.out.println(list.get(i));
	    }
	    list.remove(1);// to remove  somewhere between return the element deleted
	    list.remove("qusai");// to remove the element determine by the element
	    list.removeLast();//delete the last element and return the element deleted
	    list.removeFirst();//delete the first element and return the element deleted
	    
	    System.out.println(list + "\tlist1");
	    
	    LinkedList<String> list2 = new LinkedList<>();
	    
	    list2 = (LinkedList<String>)list.clone();
	    
	    System.out.println(list2 + "\tlist 2");
	    list2.addLast("yazan");
	    list2.addFirst("Mohammed");
	    System.out.println(list2 + "\tlist 2");
	    
	    LinkedList<String> list3 = new LinkedList<>();
	    list3 = (LinkedList<String>) list2.clone();
	    
	    System.out.println(list3 + "\t list3");
	    
	    list3.clear();
	    
	    System.out.println(list3 + "\t list3");
	    
	    list2.removeAll(list);
	    
	    System.out.println(list2);
	    
	    
	    
	    
	}

}

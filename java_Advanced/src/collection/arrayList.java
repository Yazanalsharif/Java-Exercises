package collection;
import java.util.ArrayList;

public class arrayList {
	public static void main(String args []) {
		ArrayList list1 = new ArrayList();
		//add method to add compnant to the arrayList
		Object x [] = {1, 2, 2, 3 ,4};
		list1.add("Mohammed");
		list1.add("Ikram");
		list1.add("qusai");
		list1.add("yazan");
	//	list1.add(x);
		
	//	System.out.println(list1);
		
		// remove method and return true if delete and false if the element does't exist in ArrayList
	//	Object x = list1.remove("yazed");
		
		System.out.println(x);
		
		System.out.println(list1);
		
		ArrayList list2 = new ArrayList();
		
		list2.addAll(list1);
		
		System.out.println(list2.size());
		
		//add elements to list2
		list2.add("yazed");
		list2.add("Raghad");
		
		System.out.println(list2 + "\t" + list2.size());
		
		
   // add Collection to list 2 Note:- the size will increase only one and the Collection will store in one space
		list2.add(list1);
        
		
		System.out.println(list2 + "\t" + list2.size());
		
		
		ArrayList list3 = new ArrayList();
		
		 list3 = (ArrayList)list2.clone();//return object and must convert to arrayList becouse arrayList upper object 
		
		Object list4 = list3.clone();// return object 
		
		list3.clear();// void method
		
	    System.out.println(list4);// oject list4 will display like array
	    
	    System.out.println(list3);// empty becouse i clean it 
	    
	    System.out.println("ArrayList with generic");
		
		ArrayList<String> list5 = new ArrayList<>();
		list5.add("Mohammed");
		list5.add("Ikram");
		list5.add("qusai");
		list5.add("yazan");
		ArrayList<Integer> list6 = new ArrayList<>();
		list6.add(50);
		list6.add(100);
		list6.add(70);
		list6.add(80);
		//note:- i add collection String in the collection Double but will make alot runTime error when use it
		//ArrayList<Double> list7 = (ArrayList<Double>)list5.clone();
	    //System.out.println(list7);
		
		System.out.println(list5);
		
		System.out.println(list6);
		
		
		
		ArrayList<String> list8 = (ArrayList<String>)list5.clone();
		
		//cant add collection Integer to collection String from method add
		//list8.addAll(list6);
		
		//add element to list 8
		list8.add("waleed");
		list8.add("skik");
		list8.add("hamdi");
		list8.add("Nabil");
		
		list8.retainAll(list5);// return list to list8 and the list is list8 cross list5 
		
		System.out.println(list8.contains("Mohammed"));//if mohammed exist in list8 return true
		
		
		System.out.println(list8.contains("waleed"));//if mohammed exist in list8 return true

		System.out.println("list8 \t" + list8);
		
		list8.add("yazed");
		list8.add("raghad");
		list8.add("Rasmia");
		
		list8.removeAll(list5);//remove all elements in list5 from list8
		
		
	    System.out.println(list8+ "\t"+ list8.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

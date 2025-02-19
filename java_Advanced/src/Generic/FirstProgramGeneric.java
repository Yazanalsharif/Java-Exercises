package Generic;

public class FirstProgramGeneric {
	public static  void main(String args[])  {
		
	//	String x = "yazan 568";
	    test  name = new test();
	  
 		name.setT(300);
 		System.out.print(name.getT());
 		name.setT("yazan al sharif");
 		System.out.print(name.getT());
		//numChars(x);
		
		
		
		
		
		
		
		
		
		
		 // this to search genaric method 
		/*Integer x [] = {10, 23, 12, 14, 15};
		int g = 23;
		int y = 0;
		System.out.print(search(x, g) + "\n");
		System.out.print(search(x, y) + "\n");
		*/
		
		// this to print method
	/*	Integer x [] = {10, 11, 12, 14, 15};
		Integer y[] = {30, 40, 50, 100};
		String  b [] = {"hello", "hi", "word"};
		Integer n[];
		n = print(x); */ //when i want to use array in generic method it must be wrapper class =>Integer, Double 
		
	}
	public static < T > T[] print(T x []) {
		T y[];
		y = x;
		System.out.print(y + "\n");
		for (T elem : x) {
			System.out.print(elem + "\n");
		}
		return y;
	}
	public static <T extends Comparable<T>> T max(T x, T y, T z) {
		T max = x;
		if(max.compareTo(y) < 0) 
			max = y;
		else if(max.compareTo(z) < 0)
			max = z;
		return max;

	}
	public static <T extends Comparable<T>> Boolean search(T x[], T y) {
	  
	   for(T elem : x) {
		   if(elem.equals(y))
			   return true;
	   }
	   
	   return false;
		
	}
	public static void numChars (String a) {
		int countChar = 0;
		int countNumber = 0;
		for (int i = 0; i < a.length(); i++) {
		String x = a.substring( i,i + 1);
		try {
			Integer.parseInt(x);
			countNumber++;
		}catch (Exception e) {
			countChar++;
		}

		}
		System.out.print(countNumber + "\n" + countChar);
	}
	
	

	
	
	
	
	
	
	
	
}

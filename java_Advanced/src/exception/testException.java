package exception;
import java.util.Scanner;

public class testException {

	

	
		public static void main(String args [])  {
			try {
				int x = 10, y = 0, z;
				if (y == 0) 
					throw new Exception1("y equals zero");
			} catch (Exception1 e) {
				
			}
			try {
			f(110);
			} catch (Exception e) {
				System.err.println(e.getMessage() + "\n");
			}
			f2(0);
		
		try {
			testTest();
		} catch(ArithmeticException e) {
			System.out.print(e.getMessage());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.print(e.getMessage());
			} catch (Exception e) {
				
			}
		}
		
		
		
		
		public static void test() {
			int y = 10,
					x,
					z;
					int u[] = new int [10];
				//try {
				Scanner input = new Scanner(System.in);
				z = input.nextInt();
				
				
				
			    x = y/z;
				System.out.println("hello every");
				
				u[10] = 10;
				
				
		}
				
				
				/*} catch (ArithmeticException e) {
					System.out.println(e.getMessage());
					System.out.println("hello guys");
					
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.print("hello word");
				}*/
		
		public static void testTest() {
			test();
		}
		//with throws Exception i can make Exception but will catching in another method
		public static void f(int y) throws Exception {
			
			if (y > 100) {
				throw new Exception("wrong value");
				
			} else if(y == 1) {
				
				throw new Exception1("the number is 1");
				
			}
				System.out.print(y);
		
		
		
		
		}
		//without throws Exception I have to try & catch in the same method 
		public static void f2(int z)  {
			int x, y = 10;
			try {
				x = y/z;
			  throw new Exception("hello word");
			} catch (Exception e) {
				System.out.print(e.getMessage());
				
			}
		}
		
		
		// if i Want to make exception it must the exception not in the java 
		// like i can not use the exception i made it with exception divide by zero 
		// end of exception 
		
		
		
		
		
		
	}



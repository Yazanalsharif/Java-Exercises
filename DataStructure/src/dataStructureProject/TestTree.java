package dataStructureProject;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class TestTree {
	public static int count = 0;
	public static Tree tree = new Tree();
	public static int toInsert[] = new int [100];
	public static void main(String args []) {
		
		menu();

}
	public static void menu() {
		boolean loop = true;
		while(loop) {
			try {
			String input = JOptionPane.showInputDialog(
					"1. insertElement\n" + 
					"2. print the Tree\n"  +
					"3. copy in array\n"	 +
					"4. print the array\n"  +
					"5. exit");
			int choose = Integer.parseInt(input);
			
			switch(choose) {
			case 1:insert();break;
			case 2:printWay();break;
			case 3:copyToArray();break;
			case 4:printArray(copyToArray());break;
			case 5:exit();break;//done
			}
			} catch(Exception e) {
				loop = false;
			}
		}
	}
	public static void insert() {
		//int test[] = createArray();
		tree.insertLevelWise(createArray(), tree.root, 0, count);
	}

	
	public static void printWay() {
		boolean loop = true;
		while(loop) {
			try {
				String input = JOptionPane.showInputDialog(
						"1. level wise \n" + 
				        "2. preOrder \n" +
						"3. postOrder \n" + 
				        "4. inOrder \n"   +
				        "5. return to Menu");
				int choose = Integer.parseInt(input);
				switch(choose) {
				
				case 1:tree.levelWise();System.out.print("\n");break;
				case 2:tree.preOrder(tree.root);System.out.print("\n");break;
				case 3:tree.postOrder(tree.root);System.out.print("\n");break;
				case 4:tree.inOrder(tree.root);System.out.print("\n");break;
				case 5:loop = false;break;
					
				}

			} catch(Exception e) {
				loop = false;
			}
		}
	}
	public static LinkedList [] copyToArray() {
	
		try {
		LinkedList<Integer> listLevelWise = tree.storeValuesInLinkedList();
		LinkedList arrayOfLinkedLevel [] = tree.copy(listLevelWise);
		JOptionPane.showMessageDialog(null, "Done");
		return arrayOfLinkedLevel;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "the tree is empty");
			return null;
		}
		
	}
	public static void printArray(LinkedList [] arrayOfLinkedLevel) {
		try {
		for(int i = 0; i < arrayOfLinkedLevel.length; i++) {
			System.out.println(arrayOfLinkedLevel [i]);
		}
		} catch(Exception e) {
			
		}
		
	}
	public static void exit() {
		System.exit(0);
	}
	
	
	public static int [] createArray() {
		
		boolean inputs = true;
		while(inputs) {
		try {
			String input = JOptionPane.showInputDialog(null, "enter the number");
			int value = Integer.parseInt(input);
			toInsert[count] = value;
			count++;
			}
			 catch(Exception e) {
				 JOptionPane.showMessageDialog(null, "return to menu");
				 inputs = false;
			 }
		}
		
		return toInsert;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
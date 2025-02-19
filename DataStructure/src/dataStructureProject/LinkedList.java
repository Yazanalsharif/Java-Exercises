package dataStructureProject;

public class LinkedList {
	ListNode levels;
	private int length;
	
	int size() {
		return length;
	}
	void print() {
		ListNode toPrint;
		toPrint = levels;
		while(toPrint != null) {
			System.out.print(toPrint.value);
			toPrint = toPrint.link;
		}
	}
	void insertLast(int item) {
		ListNode newNode = new ListNode();
		newNode.value = item;
		newNode.link = null;
		if(levels == null) {
			levels = newNode;
	    } else {
			ListNode loop = levels;
			while(loop.link != null) {
				loop = loop.link;
			}
			loop.link = newNode;
			length++;
		}
			
		
	}
	
	

}

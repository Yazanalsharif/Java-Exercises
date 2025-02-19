package linearLinkedList;

public class LinkedList {
  Node firstNode;
private int length;
 
 //methods linked list
 int size() {
	 return length;
 }
 
 public void print() {
	 Node toPrint;
	 toPrint = firstNode;
	 while(toPrint != null) {
		 System.out.println(toPrint.item);
		 toPrint = toPrint.link;
	 }
	 
 }
      void insertSecound(String item) {
	 
	 if(firstNode == null)
		 return;
	 Node newNode = new Node();
	 newNode.item = item;
	 newNode.link = firstNode.link;
	 
	 firstNode.link = newNode;
	 length++;	 
 }
      
     void insertLast(String item) {
    	 
	 Node newNode = new Node();
	 newNode.item = item;
	 newNode.link = null;
	 if(firstNode == null) {
		 firstNode = newNode;
	 } else {
		 Node loop = firstNode;
		 while(loop.link != null) {
			 loop = loop.link;
		 }
		 loop.link = newNode;
		 length++;
	 }

		 
 }
     void deleteLast() {
    	 Node deleteItem = firstNode.link;
    	 Node beforeOne = firstNode;
    	if(firstNode != null) {
    		if(firstNode.link == null) {
    			firstNode = null;
    		} else {
    			while(deleteItem.link != null) {
    				beforeOne = beforeOne.link;
    				deleteItem = deleteItem.link;
    			}
    			beforeOne.link = null;
    		}

    	}
     }
     void insertFirst(String item) {
    	 Node newNode = new Node();
    	 newNode.item = item;
    	 newNode.link = null;
    	 if(firstNode == null) {
    		 firstNode = newNode;
    	 } else {
    		 newNode.link = firstNode;
    		 firstNode = newNode;
    	 }
     }
     //you have make method search and another method
     
     
     
     
     
     
     
     
     
     
     
     
     
     

}

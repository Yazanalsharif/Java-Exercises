package linearLinkedList;

public class Node {
	String item;
	Node link;
	Node(){
		
	}
	Node(String item, Node link){
		this.item = item;
		this.link = link;
	}
	void setItem(String item) {
		this.item = item;
	}
	String getItem() {
		return this.item;
	}
	void setFirst(Node link) {
		this.link = link;
	}
	Node getFirst() {
		return this.link;
	}

}

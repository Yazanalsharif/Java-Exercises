package dataStructureProject;
//queue :- fifo first in first out insert and delete in differnt place
public class Queue {
	QueueNode front, rear;
	int length;
	
	Queue(){
		
	}
	//is empty
	boolean isEmpty() {
		return front == null;
	}
	
	//method to insert last
	void enqueue(TreeNode t) {
		QueueNode newQueue  = new QueueNode();
		newQueue.tree = t;
		if(isEmpty()) {
			front = newQueue;
			rear = newQueue;
			++length;
		}else {
			rear.link = newQueue;
			rear = newQueue;
			++length;
			
		}
		
	}
	TreeNode dequeue() {
		if(isEmpty()) {
			return null;
		} else {
			
			TreeNode tree;
			tree = front.tree;
			QueueNode delete = front;
			front = front.link;
			delete.link = null;
			delete = null; // does't matter if you write it or not
			--length;
			return tree;
		}
	}
	void print() {
		if(isEmpty())
			System.out.print("empty");
		else {
			QueueNode n = front;
			while( n!= null) {
				System.out.println(n.tree);
				n = n.link;
			}
		}
	}
	

}

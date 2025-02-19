package dataStructureProject;
import java.util.LinkedList;
import javax.swing.JOptionPane;


//enqueue method to insertLast to the Queue dataStructure
//dequeue method to delete the first Element
public class Tree {
	TreeNode root;
	int length;
	Tree(){
		root = null;
	}
	
	//method to use complete TreeNode
	void levelWise() {
	  Queue q = new Queue();
	  TreeNode N;
	  q.enqueue(root);
	  while(!q.isEmpty()) {
		  N = (TreeNode)q.dequeue();
		  if(N != null) {
			  System.out.print(N.value);
			  q.enqueue(N.left);
			  q.enqueue(N.right);
		  }
	  }
		
	}
	//method to travel preOrder 
	void preOrder(TreeNode preTree) {
		if(preTree != null) {
			System.out.print(preTree.value);
			preOrder(preTree.left);
			preOrder(preTree.right);
			
		}
		//System.out.print("\n");
	}
	void postOrder(TreeNode postTree) {
		if(postTree != null) {
			postOrder(postTree.left);
			postOrder(postTree.right);
			System.out.print(postTree.value);
		}
		//System.out.print("\n");
	}
	void inOrder(TreeNode inTree) {
		if(inTree != null) {
			inOrder(inTree.left);
			System.out.print(inTree.value);
			inOrder(inTree.right);
		}
		//System.out.print("\n");
	}
	
	TreeNode insertLevelWise(int arr[], TreeNode root, int i, int full) {
		
		if(i < full) {
			TreeNode toInsert = new TreeNode();// to store the value here and pass it in the right place
			toInsert.value = arr[i];
			root = toInsert;
			
			root.left = insertLevelWise(arr, root.left, 2 * i + 1, full);
			
			
			root.right = insertLevelWise(arr, root.right, 2 * i + 2, full);
			
		}
		this.root = root;
		return root;
	}
	
	int heigh(TreeNode root) {
		int height = 0;
		while(root.left != null) {
			height++;
			root = root.left;
		}
		return height;
	}
	//to insert the data level wise in the linkedList
	LinkedList<Integer> storeValuesInLinkedList() {
		LinkedList<Integer> data = new LinkedList<Integer>();
		Queue q = new Queue();
		TreeNode nodes;
		q.enqueue(root);
		while(!q.isEmpty()){
			nodes = (TreeNode)q.dequeue();
			if(nodes != null) {
				//here to write the code
				data.add(nodes.value);
				q.enqueue(nodes.left);
				q.enqueue(nodes.right);
			}
			
		}
		return data;
	
	}
	LinkedList<Integer>[] copy(LinkedList<Integer> list) {
		boolean indexBounds = true;
		int size = heigh(root) + 1;
		LinkedList levels[] = new LinkedList[size];
		int count = 0;
		int i = 0;
		int y1 = 0;
		for(; i < size; i++) {
			levels[i] = new LinkedList();
			double numOfElementInIndex = Math.pow(2, i);
			int y = (int)numOfElementInIndex;
			 y1 = y + count;
			for(; count < y1 && indexBounds; ) {
				try {
				levels[i].addLast(list.get(count));
				count++;
				}catch(Exception e) {
					indexBounds = false;
				}

			}
		}
	
		return levels;

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

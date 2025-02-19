package dataStructureProject;

public class QueueNode {
	QueueNode link;
	TreeNode tree;
	
	public QueueNode() {
		
	}
	public QueueNode(QueueNode link, TreeNode tree) {
		this.link = link;
		this.tree = tree;
	}

}

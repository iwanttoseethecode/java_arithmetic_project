package binarytree;

import java.util.ArrayList;
import java.util.List;

import binarytree.BinaryTree.Node;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BinaryTree binaryTree = new BinaryTree("A");
//		Node nodeB = binaryTree.new Node(1, "B");
//		Node nodeC = binaryTree.new Node(2,"C");
//		Node nodeD= binaryTree.new Node(3,"D");
//		Node nodeE = binaryTree.new Node(4,"E");
//		Node nodeF = binaryTree.new Node(5,"F");
//		Node nodeG = binaryTree.new Node(6,"G");
//		
//		binaryTree.getRoot().leftChild=nodeB;
//		binaryTree.getRoot().rightChild=nodeC;
//		nodeB.leftChild=nodeD;
//		nodeB.rightChild=nodeE;
//		nodeC.rightChild=nodeF;
//		nodeD.leftChild=nodeG;

//		System.out.println(binaryTree.getHeight());
//		System.out.println(binaryTree.getNodeNum());
//		binaryTree.preOrder();
//		binaryTree.midOrder();
//		binaryTree.postOrder();
//		binaryTree.stackPreOrder();
		
		
//		BinaryTree binaryTree = new BinaryTree();
//		//ABDG###E##C#F##
//		List<String> arrayList = new ArrayList<String>();
//		
//		String[] dataArray = {"A","B","D","G","#","#","#","E","#","#","C","#","F","#","#"};
//		for(String a : dataArray){
//			arrayList.add(a);
//		}
//		binaryTree.createBinaryTreeByList_pre(arrayList);
//		binaryTree.preOrder();
		
		SearchBinaryTree searchBinaryTree = new SearchBinaryTree();
		
		int[] intArray = {12,52,47,96,58,63,86,45,77,99,2,10};
		for(int i=0; i<intArray.length;i++){
			searchBinaryTree.put(intArray[i]);
		}
		
//		searchBinaryTree.midOrder();
//		System.out.println(searchBinaryTree.searchTreeNode(63));
		
		searchBinaryTree.deleteTreeNode(58);
		searchBinaryTree.midOrder();
	}

}

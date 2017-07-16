package binarytree;

import java.util.List;
import java.util.Stack;

/**
 * �������Ĺ������������
 * 
 *                 A
 *         B				C
 *     D       E				F
 *  G
 * 
 * */

public class BinaryTree {
	
	private Node root;
	
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}


	public BinaryTree(String data) {
		super();
		this.root = new Node(0,data);
	}
	
	public BinaryTree(){
		super();
	}
	
	/*
	 * ��ǰ��������������ɶ�Ӧ���������� ABDG###E##C#F##,ת������
	 * */
	
	public Node createBinaryTreeByList_pre(List<String> dataList){
		return createBinaryTreeByList_pre(dataList.size(), dataList);
	}
	
	private Node createBinaryTreeByList_pre(int size,List<String> dataList){
		if(dataList.isEmpty()){
			return null;
		}
		String data = dataList.get(0);
		if(data.equals("#")){
			dataList.remove(0);
			return null;
		}
		int index = size-dataList.size();
		
		Node node = new Node(index,data);
		
		if(index==0){
			root = node;
		}
		
		dataList.remove(0);
		node.leftChild = createBinaryTreeByList_pre(size, dataList);
		node.rightChild = createBinaryTreeByList_pre(size, dataList);
		
		return node;
	}
	
	/**
	 * ����������
	 * */
	public int getHeight(){
		return getHeight(root);
	}
	
	private int getHeight(Node node) {
		if(node==null){
			return 0;
		}else{
			return Math.max(getHeight(node.getLeftChild()), getHeight(node.getRightChild())) + 1;
		}
		
	}
	
	/*
	 * ��������Ľڵ���
	 * */
	public int getNodeNum(){
		return getNodeNum(root);
	}

	private int getNodeNum(Node node) {
		if(node==null){
			return 0;
		}else{
			return getNodeNum(node.leftChild)+getNodeNum(node.rightChild)+1;
		}
		
	}
	
	/*
	 * ǰ�����
	 * */
	public void preOrder(){
		preOrder(root);
	}
	

	private void preOrder(Node node) {
		if(node==null){
			return;
		}else{
			System.out.print(node.getNodeData());
			preOrder(node.leftChild);
			preOrder(node.rightChild);
		}
		
	}

	/*
	 * ����ջ�ṹǰ�����
	 * */
	public void stackPreOrder(){
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		
		while(!stack.isEmpty()){
			Node node =stack.pop();
			System.out.print(node.getNodeData());
			
			if(node.rightChild!=null){
				stack.push(node.rightChild);
			}
			
			if(node.leftChild!=null){
				stack.push(node.leftChild);
			}
		}
	}
	
	/*
	 * �������
	 * */
	public void midOrder(){
		midOrder(root);
	}
	
	
	private void midOrder(Node node) {
		if(node==null){
			return;
		}else{
			midOrder(node.leftChild);
			System.out.println(node.getNodeData());
			midOrder(node.rightChild);
		}
		
	}
	
	
	/*
	 * �������
	 * */
	public void postOrder(){
		postOrder(root);
	}

	private void postOrder(Node node) {
		if(node==null){
			return;
		}else{
			postOrder(node.leftChild);
			postOrder(node.rightChild);
			System.out.print(node.getNodeData());
		}
		
	}

	class Node{
		int index ;
		String NodeData;
		Node leftChild;
		Node rightChild;
		
		public Node(int index, String nodeData) {
			super();
			this.index = index;
			NodeData = nodeData;
		}

		public Node getLeftChild() {
			return leftChild;
		}

		public void setLeftChild(Node leftChild) {
			this.leftChild = leftChild;
		}

		public Node getRightChild() {
			return rightChild;
		}

		public void setRightChild(Node rightChild) {
			this.rightChild = rightChild;
		}

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}

		public String getNodeData() {
			return NodeData;
		}

		public void setNodeData(String nodeData) {
			NodeData = nodeData;
		}
		
		
		
	}
	
}

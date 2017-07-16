package binarytree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 建立查找二叉树
 * */

public class SearchBinaryTree {
	
	private TreeNode root;
	
	
	/**
	 *存入节点
	 * 
	 * */
	public TreeNode put(int data){
		return put(data,root);
	}
	
	private TreeNode put(int data,TreeNode parent){
		TreeNode newNode = new TreeNode(data);
		if(parent==null){
			parent = newNode;
			return newNode;
		}
		
		TreeNode oldNode = parent;
		while(oldNode!=null){
			if(data <oldNode.getData()){
				if(oldNode.leftChild==null){
					oldNode.leftChild=newNode;
					return newNode;
				}
				oldNode = oldNode.leftChild;
			}else if(data > oldNode.getData()){
				if(oldNode.rightChild==null){
					oldNode.rightChild=newNode;
					return newNode;
				}
				oldNode = oldNode.rightChild;
			}else{
				return null;
			}
		}
		newNode.parent = oldNode;
		return newNode;
	}
	
	/*
	 * 中序遍历二叉树
	 * */
	public List<Integer> midOrder(){
		List<Integer> treeNodeDataList = new ArrayList<Integer>();
		midOrder(root,treeNodeDataList);
		return treeNodeDataList;
	}
	
	
	
	private void midOrder(TreeNode node,List<Integer> treeNodeDataList) {
		if(node == null){
			return;
		}
		
		midOrder(node.leftChild,treeNodeDataList);
		System.out.println(node.getData());
		treeNodeDataList.add(node.getData());
		midOrder(node.rightChild,treeNodeDataList);
		
	}

	/*
	 * 根据二叉树查找数据,查找成功则返回该数字，失败就返回null
	 * */
	public TreeNode searchTreeNode(int data){
		return searchTreeNode(data,root);
	}
	
	
	private TreeNode searchTreeNode(int data, TreeNode node) {
		if(node == null){
			return null;
		}
		TreeNode searchNode = null;
		if(data<node.getData()){
			searchNode = searchTreeNode(data,node.getLeftChild());
		}else if(data>node.getData()){
			searchNode = searchTreeNode(data,node.getRightChild());
		}else if(data==node.getData()){
			searchNode = node;
		}
		return searchNode;
		
	}
	
	/*
	 * 删除某个节点 ,删除成功则返回该节点，失败就返回空. 另一种思路是找后继。
	 * */
	public TreeNode deleteTreeNode(int data){
		
		TreeNode searchNode = searchTreeNode(data);
		TreeNode parent = searchNode.parent;
		
		if(searchNode == null){
			return null;
		}
		
		if(parent == null){
			List<Integer> treeNodeDataList = midOrder();
			treeNodeDataList.remove(new Integer(data));
			for(Iterator< Integer> it = treeNodeDataList.iterator();it.hasNext();){
				put(it.next());
			}
			return root;
		}
		
		List<Integer> treeNodeDataList = new ArrayList<Integer>();
		midOrder(searchNode.leftChild,treeNodeDataList);
		midOrder(searchNode.rightChild,treeNodeDataList);
		
		TreeNode Child = null;
		
		for(Iterator< Integer> it = treeNodeDataList.iterator();it.hasNext();){
			put(it.next(),Child);
		}
		
		
		if(parent.leftChild == searchNode){
			parent.leftChild = Child;
		}else if(parent.rightChild == searchNode){
			parent.rightChild = Child;
		}
		
		return searchNode;

	}

	class TreeNode{
		private int data;
		private TreeNode leftChild;
		private TreeNode rightChild;
		private TreeNode parent;
		
		public TreeNode(int data) {
			super();
			this.data = data;
		}
		
		

		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public TreeNode getLeftChild() {
			return leftChild;
		}
		public void setLeftChild(TreeNode leftChild) {
			this.leftChild = leftChild;
		}
		public TreeNode getRightChild() {
			return rightChild;
		}
		public void setRightChild(TreeNode rightChild) {
			this.rightChild = rightChild;
		}
		public TreeNode getParent() {
			return parent;
		}
		public void setParent(TreeNode parent) {
			this.parent = parent;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "data: "+data;
		}
		
	}
	
}

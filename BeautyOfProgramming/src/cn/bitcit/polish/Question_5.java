package cn.bitcit.polish;

import java.util.Stack;

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		Node node = ll.head;
/*		Stack<Integer> st = new Stack<>();
		while(node != null){
			st.push(node.val);
			node = node.next;
		}
		while(!st.empty()){
			System.out.print(st.pop()+"  ");
		}
*/		
		print(node);
	}



private static void print(Node node){
	if(node == null){
		return;
	}
	print(node.next);
	System.out.println(node.val);
}

}
class Node{
	int val;
	Node next;
}
class LinkedList{
	private int cap;
	public Node head;
	public LinkedList(){
		head = null;
		cap = 0;
	}
	public void add(int val){
		if(cap == 0){
			head = new Node();
			head.val = val;
		}else{
			Node temp = new Node();
			temp.val = val;
			Node point = head;
			while(point.next != null){
				point = point.next;
			}
			point.next = temp;
			
		}
		
		cap++;
	}
}
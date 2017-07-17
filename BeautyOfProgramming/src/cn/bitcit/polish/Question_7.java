package cn.bitcit.polish;

import java.util.Stack;

public class Question_7 {

	public static void main(String[] args) {
		MyQueue q=new MyQueue();
		q.appendTail(1);
		q.appendTail(2);
		q.appendTail(3);
		q.deleteHead();
		q.deleteHead();
		q.appendTail(4);
		q.deleteHead();
	}

}

class MyQueue{
	private Stack<Integer> stack1,stack2;
	public MyQueue(){
		stack1=new Stack<Integer>();
		stack2=new Stack<Integer>();
		
	}
	public void appendTail(int val){
		stack1.push(val);
	}
	
	public int deleteHead(){
		if(stack2.size()==0){
			if(stack1.size()==0){
				System.out.println("Queue is empty! can not delete"); 
			}else{
				while(stack1.size()!=0){
					stack2.push(stack1.pop());
				}
			}
		}
		return stack2.pop();
	}
}


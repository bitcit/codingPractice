package cn.bitcit.polish;

import java.util.Scanner;

public class Question_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		System.out.println(fibonacci(n));
	}
	
	public static long fibonacci(int n){
		long pre=0;
		long next=1;
		if(n==0) return pre;
		if(n==1) return next;
		long val=0;
		while(n!=1){
			val=pre+next;
			pre=next;
			next=val;
			n--;
		}
		return val;
	}

}

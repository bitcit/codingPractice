package cn.bitcit.polish;

import java.util.Scanner;

public class Question_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int len;
		len=in.nextInt();
		int[] num=new int[len];
	
		for(int i=0;i<len;i++){
			num[i]=in.nextInt();
		}
		in.close();
		quickSort(num,0,len-1);
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
	}
	
	public static void quickSort(int[] num,int start,int end){
		if(start==end){
			return;
		}
		int index=partition(num,start,end);
		if(index>start){
			quickSort(num,start,index-1);
		}
		if(index<end){
			quickSort(num,index+1,end);
		}
	}
	
	public static int partition(int[] num,int start,int end){
		if(num==null||start<0||end>num.length){
			System.out.println("Invalid parameters");
		}
		int index=(int)(Math.random()*(end-start)+start);
		int temp=num[end];
		num[end]=num[index];
		num[index]=temp;
		int point=start-1;
		for(int i=start;i<end;i++){
			if(num[i]<num[end]){
				point++;
				if(point!=i){
					temp=num[i];
					num[i]=num[point];
					num[point]=temp;
				}
			}
		}
		
		point++;
		temp=num[end];
		num[end]=num[point];
		num[point]=temp;
		return point;
	}

}

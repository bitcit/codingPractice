package cn.bitcit.polish;

import java.util.Scanner;

public class Question_8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int[] arr=new int[num];
		for(int i=0;i<num;i++){
			arr[i]=in.nextInt();
		}
		in.close();
		System.out.println(findMin(arr,0,arr.length-1));
		
	}
	
	public static int findMin(int[] arr,int start,int end){
		if(arr==null){
			System.out.println("arr is null");
		}
		if(arr[start]<arr[end]) return arr[start];
		if(end-start==1) return arr[end];
		int mid=(end-start)/2+start;
		if(arr[start]==arr[end]&&arr[start]==arr[mid]){
			return find(arr,start,end);
		}
		if(arr[start]<=arr[mid]){
			return findMin(arr,mid,end);
		}else{
	//		if(arr[mid]<=arr[end])  //此处条件默认成立
				return findMin(arr,start,mid);
		}
		
	}
	
	public static int find(int[] arr,int start,int end){
		int min=arr[start];
		for(int i=start+1;i<=end;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		return min;
	}

}

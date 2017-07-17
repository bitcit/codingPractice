package cn.bitcit.polish;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a={
				{1,2,8,9},
				{2,4,9,12},
				{4,7,10,13},
				{6,8,11,15}
				};
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		in.close();
		System.out.println(find(num,a));
		
	}
	
	private static boolean find(int num, int[][] a){
		if(a==null) return false;
		int row_n=a.length;
		int col_n=a[0].length;
		int row_start=0,row_end=row_n-1;
		int col_start=0,col_end=col_n-1;
		while(row_start<=row_end && col_start<=col_end){
			if(num<a[row_start][col_end]){
				col_end--;
			}else if(num>a[row_start][col_end]){
				row_start++;
			}else{
				return true;
			}
		}
		return false;
		
	}

}

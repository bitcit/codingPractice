package cn.bitcit.polish;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.close();
		System.out.println(s.replaceAll(" ", "%20"));		
		
	}

}

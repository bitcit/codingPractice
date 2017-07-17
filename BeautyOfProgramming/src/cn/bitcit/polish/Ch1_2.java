package cn.bitcit.polish;

public class Ch1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution_2();

		

	}
	
	//方法1：
	private static void solution_1(){
		byte i=81;
		while(i-->=0){
			if(i/9%3==i%9%3){
				continue;
			}
			System.out.println("A="+(i/9+1)+" B="+(i%9+1));
		}
	}
	
	//方法2：由于
	private static void solution_2(){
		int i=0b00000001;
		for(;(i&0b00001111)<=9;i=((i&0b11110000)+((i&0b00001111)+1))){
			for(i=(i&0b00001111)+(1<<4);((i&0b11110000)>>4)<=9;i=((i&0b00001111)+((i&0b11110000)+(1<<4)))){
				if((i&0b00001111)%3!=((i&0b11110000)>>4)%3){
					System.out.println("A="+(i&0b00001111)+" B="+((i&0b11110000)>>4));
				}
			}
		}
	}

}

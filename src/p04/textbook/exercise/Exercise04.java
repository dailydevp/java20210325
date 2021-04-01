package p04.textbook.exercise;

public class Exercise04 {
	public static void main(String[] args) {
		
		
		int i =0;
		while(true)	{	
			int dice1= (int)(Math.random()*6)+1;
			int dice2= (int)(Math.random()*6)+1;
			int ext = (int)dice1 + (int)dice2;
			System.out.println(dice1+","+dice2);
		if(ext != 5) {
			System.out.println( "("+dice1+","+dice2+ ")");
		 }else {
			 break;
		 }
		}
	}
	
	}


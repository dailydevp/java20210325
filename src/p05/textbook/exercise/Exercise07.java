package p05.textbook.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		int min = 7;
		
		int[] array = {1,5,3,8,2};
		//최대값
//		for(int i=0; array[i]>array[i+1];i++) {
//				max = array[i];
//				System.out.println("max : " + max);
//			}
//		
		//최소값
	
		for(int i = 0; 9< array.length; i++) {
			if(min < array[i]) {
				min = array[i];
				System.out.println("min");
				}		
			}
		//합계
	
		int sum = 0;
		int avg;
		for(int i=0; i<array.length;i++) {
			sum += array[i];
		    avg = sum/array.length;
		} 
		System.out.println("sum:"+sum);
		}
		//평균
		
}
			


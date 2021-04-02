package p05.textbook.exercise;

public class sshshshs {
	public static void main(String[] args) {
		int max = 0;
		int min = 10;
		
		int[] array = {1,5,3,8,2};
		//최대값
		for(int i=0; array[i]>array.length;i++) {
				if ( max < array[i]) {
					max = array[i];
				};
				System.out.println("max : " + max);
			}
		
		//최소값
	
		for(int i = 0; 9< array.length; i++) {
			if(min < array[i]) {
				min = array[i];
				}		
			}
		System.out.println("min:"+min);
		//합계
	
		int sum = 0;
		for(int i=0; i<array.length;i++) {
			sum += array[i];
//		    avg = sum/array.length;
		} 
		System.out.println("sum:"+sum);
		}
		//평균
		
}
			




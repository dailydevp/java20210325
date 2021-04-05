package p05.textbook.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		int min = 2;
		int sum = 0;
		
		
		int[] array = {1,5,3,8,2};
		//최대값
		for(int i=0; i<array.length; i++) {
				if(max<array[i]) {
					max = array[i];
				}
		}
			System.out.println("max : " + max);
		
		//최소값
		for(int i=0; i<array.length; i++) {
			if(min>array[i]) {
				min = array[i];
			}
		}
			System.out.println("min: " + min);
		//합계
			for(int i=0; i<array.length; i++) {
				sum += array[i];
			}
			System.out.println("total : " + sum);

		//평균
		
				double avg = (double)sum/array.length;
				System.out.println("average : " + avg);
			}
	}


			


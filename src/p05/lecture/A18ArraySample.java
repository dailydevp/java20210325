package p05.lecture;

public class A18ArraySample {
	public static void main(String[] args) {
		int[] arr1 = new int[] {3, 4, 5, 6, 7};
		int[] arr2 = new int[] {99, 88, 70};
		
		int sum1 = 0;
		for(int i=0; i<arr1.length; i++) {
			sum1 += arr1[i];
			sum1 = sum1/arr1.length;
		}
//		System.out.println(sum1);
		
		int sum2 = 0;
		for(int i=0; i<arr2.length; i++) {
			sum2 += arr2[i];
			sum2 = sum2/arr2.length;
		}
//		System.out.println(sum2);
		
		double avg1 = avg(arr1);
		double avg2 = avg(arr2);
	}
	
	public static double avg(int[] arr) {
		int avg = 0;
		
	}
}

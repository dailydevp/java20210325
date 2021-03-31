package p04.textbook;

public class ForMultiplicationTableExample2 {
	public static void main(String[] args) {
		/*
		System.out.println("새로운 줄");
		System.out.println("새로운 줄");
		System.out.print("같은 줄");
		System.out.print("같은 줄");
		System.out.println("새로운 줄");
		 */
		/*
		*
		**
		***
		****
		*****
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 *****
		 ****
		 ***
		 **
		 *
		 */
		System.out.println("역방향");
		for (int i=0; i<5; i++) {
				for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 *****
		  ****
		   ***
		    **
		     *
		 */
		System.out.println("공백정방향");
		for(int i =0; i<5; i++) {
			for(int u =0; u<i; u++) {
				System.out.print(" ");
			}for(int j =5; j>i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		     *
		    **
		   ***
		  ****
		 *****
		 */
		

		System.out.println("공백역방향");
		for(int i=0;i<5;i++) {
			for(int u=0;u<(4-i);u++) {
				System.out.print(" ");
			}for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

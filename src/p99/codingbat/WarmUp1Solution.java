package p99.codingbat;

public class WarmUp1Solution {
	public static void main(String[] args) {
		String str1  = "java servlet spring";
		int len = str1.length();
		System.out.println(len);
		
		String s1 = str1.substring(18,19);
		System.out.println(s1);
		
		String s2 = str1.substring(len-1,len);
		System.out.println(s2);
	}
		
		public boolean in1020(int a, int b) {
			// return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);

			if (a >= 10 && a <= 20) {
				return true;
			}

			if (b >= 10 && b <= 20) {
				return true;
			}

			return false;
		}

		public boolean icyHot(int temp1, int temp2) {

			if (temp1 < 0 && temp2 > 100) {
				return true;
			}

			if (temp1 > 100 && temp2 < 0) {
				return true;
			}

			return false;
			/*
			 * return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
			 */
		}

		public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
			return aSmile == bSmile;
		}
		
		/* 	내가푼방식
		public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
			  if( !aSmile ^ bSmile){
			    return true;
			  }else
			   return false;
			}
		*/


		public boolean sleepIn(boolean weekday, boolean vacation) {
			return !weekday || vacation;
		}
		/* 내가 푼 방식
		public boolean sleepIn(boolean weekday, boolean vacation) {
			  if( !weekday || vacation ){
			    return true;
			  }
			  
			  return false;
			}
		*/

		public String backAround(String str) {
			String res = "";
			int len = str.length();
			String last = str.substring(len - 1, len);

			res = last + str + last;

			return res;
		}
		
		public int sumDouble(int a, int b) {
			return (a == b) ? (a + b) * 2 : (a + b);
		}
/*		내가 푼 방식
		public int sumDouble(int a, int b) {
		    int sum = 0;
		    if(a!=b){
		    return sum = a+b;
		    }else{
		      return sum = a*2+b*2;
		    }
		}
*/
	
}

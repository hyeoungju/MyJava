package mod008;

public class PrimeNumber {

	public String primeNumber(int n) {
		String answer = "";
		int result = 0;
		int exInt = 0;
		boolean check = true;
		
		try {
			for (int i = 2; i < n; i++) {
				if(n % i == 0) {
					check = false;
					exInt = i;
					break;
				}
			}
			if(check == true) {
				result = n;
				answer = result + "은 소수";
			}else {
				PrimeNumException e = new PrimeNumException();
				throw e;
			}
		} catch(PrimeNumException e) {
			
			answer = "소수 아님 \n" + n + " = " + (n / exInt ) + " X " + exInt;
		}
		return answer;
	}
}

package seleniumjavaclass;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		
		 int num = 29;
	        boolean prime = true;

	        for (int i = 2; i < num; i++) {
	            if (num % i == 0) {
	                prime = false;
	                break;
	            }
	        }

	        System.out.println(prime && num > 1 ? "Prime" : "Not Prime");

	}

}

package seleniumjavaclass;

public class CountWordsInStringWithSpace {

	public static void main(String[] args) {
		
		 String s = "this is hello world";
	        int spaces = 0;

	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) == ' ')
	                spaces++;
	        }

	        int words = spaces + 1; // words = spaces + 1

	        System.out.println("Words = " + words);
	        System.out.println("Spaces = " + spaces);

	}

}

package seleniumjavaclass;

public class CountWordsInString {

	public static void main(String[] args) {
		
		String s = "this is hello world";
        int count = s.split(" ").length;

        System.out.println(count);

	}

}

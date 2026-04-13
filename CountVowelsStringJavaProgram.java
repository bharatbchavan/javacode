package seleniumjavaclass;

public class CountVowelsStringJavaProgram {
	
	
     

	public static void main(String[] args) {

        String s = "bharat";
        int count = 0;

        for (char c : s.toCharArray())
            if ("aeiou".indexOf(c) != -1)
                count++;

        System.out.println(count);
        
        
        
       

	}
}

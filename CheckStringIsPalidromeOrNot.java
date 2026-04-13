package seleniumjavaclass;

public class CheckStringIsPalidromeOrNot {

	public static void main(String[] args) {
		
	       String s = "madam";

	        if (s.equals(new StringBuilder(s).reverse().toString()))
	            System.out.println("Palindrome");
	        else
	            System.out.println("Not Palindrome");
	        
	     
	        
	        
	}
            
        

	   

	}


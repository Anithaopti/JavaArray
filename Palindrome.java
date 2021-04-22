
public class Palindrome {

	public static void main(String[] args) {
		
		String text= "malayala";
		 int length = text.length();   
		 String reverse = "";
	 		for ( int i = length - 1; i >= 0; i-- )  
	 		{
	         reverse = reverse + text.charAt(i); 
	 		}
			if(text.equals(reverse))
			System.out.println("The given text is Palindrome");
			else
			System.out.println("The given text is not a Palindrome");

		}

}


public class Reversenum {

	public static void main(String[] args) {
		
	        int number=87874, reverse = 0;
	        int remainder = 0;
	        System.out.println(number);
	        do{
	            remainder = number%10;
	            reverse = reverse*10 + remainder;
	            number = number/10;
	            }while(number > 0);
	        System.out.println("Reversed Number is "+reverse);   
	        if(number==reverse)
	        	System.out.println("The given number is Palindrome");
	        else
	        	System.out.println("The given number is not a Palindrome");
	        	        	
	}
}

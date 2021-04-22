
public class Prime {

	public static void main(String[] args) {
		
		int num= 4,i,remainder=0;
		
			for(i=2; i<=num/2; i++)
			{
			remainder = num%i;
			}
			if(remainder==0)
				System.out.println(num+" is a prime number");
			else
				System.out.println(num+" not a prime number");
		}
	}



public class Perfect {

	public static void main(String[] args) {
		
			    long n=5677436,sum=0;
		            int num=876;
			    int i=1;
			    while(i<=n/2)
			    {
			       if(n%i==0)
			       {
				sum+=i;
			       }
			      i++;
			    }
			if(sum==n)
			{
			System.out.println(n+" is a perfect number");
		               } 
			else
			System.out.println(n+" is not a  perfect number"); 
			}
		}
	



import java.util.Scanner;
public class sumofOddNumbers {
	  public static void main(String args[]) {
	        int num,i,sum=0;
	 
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a number");
	        num= sc.nextInt();
	 
	        for(i=0;i<=num; i++)
	        {
	            if((i%2)==1)
	            {
	                sum+=i;
	            }
	        }
	     
	        System.out.println("Sum of all odd numbers between 1 to " +num+"="+sum);
	    }
	}

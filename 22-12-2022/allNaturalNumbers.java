import java.util.Scanner;
public class allNaturalNumbers {
	public static void main(String[] values) {
		int product = 1, num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number:");
		num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			product *= i;
		}
		System.out.println("Product of first '"+num+"' numbers: " + product);
	}
}

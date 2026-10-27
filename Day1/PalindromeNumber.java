package Day1;
import java.util.Scanner;
public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=s.nextInt(),rev=0,r,m=n;
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n/=10;
		}
		if(m==rev) {
			System.out.print("It is a Palindrome");
		}
		else {
			System.out.print("It is not a Palindrome");
		}
	}
}

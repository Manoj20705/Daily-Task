package Day1;
import java.util.Scanner;
public class ReverseNumber5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=s.nextInt(),r,rev=0;
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n/=10;
		}
		System.out.println(rev);
	}
}

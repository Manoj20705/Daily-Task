package Day1;
import java.util.Scanner;
public class CountDigits {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=s.nextInt(),count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		System.out.println(count);
	}
}

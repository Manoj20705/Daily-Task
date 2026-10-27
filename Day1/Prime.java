package Day1;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=s.nextInt();
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("Not a Prime");
				return;
			}
		}
		System.out.println("Prime");
	}
}

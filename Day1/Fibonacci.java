package Day1;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n=s.nextInt(),first=0,last=1,temp;
		for(int i=0;i<n;i++) {
			System.out.println(first);
			temp=first+last;
			first=last;
			last=temp;
		}
	}
}

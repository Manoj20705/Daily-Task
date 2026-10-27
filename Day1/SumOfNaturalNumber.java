package Day1;
import java.util.Scanner;
public class SumOfNaturalNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n=s.nextInt(),sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}

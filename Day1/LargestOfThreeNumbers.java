package Day1;
import java.util.Scanner;
public class LargestOfThreeNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Three Number: ");
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
		int n=(a>b)?a:b;
		int result=(n>c)?n:c;
		System.out.println("The Gretest number is: "+result);
		s.close();
	}
}

package Day1;
import java.util.Scanner;
public class PostiveNegative3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n= s.nextInt();
		if(n>0) {
			System.out.println("The Number is Positive");
		}
		else if(n<0) {
			System.out.println("The Number is Negative");
		}
		else {
			System.out.println("Zero");
		}
		s.close();
	}
}

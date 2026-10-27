package Day1;
import java.util.Scanner;
public class EvenOrAdd1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		String result = n%2==0?"Even":"Odd";
		System.out.println(result);
		s.close();
	}
}

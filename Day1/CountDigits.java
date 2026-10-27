package Day1;
import java.util.Scanner;
public class CountDigits {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=s.nextInt(),sum=0,r,m=n;
		while(n>0 || sum>9) {
			if(n==0) {
				n=sum;
				sum=0;
			}
			r=n%10;
			sum+=r;
			n/=10;
		}
		System.out.println(sum);
	}
}

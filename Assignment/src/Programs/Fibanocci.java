package Programs;
import java.util.Scanner;
public class Fibanocci {
	public static int evenSum(int n) {
		int a=0,b=1,c;
		int sum=0;
		for(int i=1;i<=n;i++) {
			
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			if(c%2==0) {
				sum=sum+c;
			}
		}
		System.out.println();
		return sum;
		
	}

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the limit :");
		int n=scan.nextInt();
		System.out.println("sum of even fibanocci "+evenSum(n));
		
	}

}

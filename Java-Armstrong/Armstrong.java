import java.util.*;

public class Armstrong{
	
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		do{
			System.out.print("Enter an integer: ");
			int a = in.nextInt();
			int temp = a;
			int rem, ans = 0;
			while(a != 0){
				rem = a % 10;
				ans += rem * rem * rem;
				a /= 10;
			}
			if (ans == temp) System.out.println(temp + " is an armstrong number.\n");
			else System.out.println(temp + " is not an armstrong number.\n");
		}while(true);
	}
}
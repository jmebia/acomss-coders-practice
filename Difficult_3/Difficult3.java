import java.util.*;

public class Difficult3{
	
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Input(format: number/letter/number/letter....): ");
		String _input = in.next();
		String disp = "";
		for(int a=0;a<_input.length();a+=2){
			int count = Integer.parseInt(""+_input.charAt(a));
			for(int b=0;b<count;b++){
				disp += _input.charAt(a+1);
			}
		}
		System.out.println(disp);
	}
}
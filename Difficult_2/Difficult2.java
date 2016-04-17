public class Difficult2{
	public static void main(String []args){
		String disp = " = ";
		for(int x=1;x<=9;x++){
			for(int y=9;y>=1;y--){
				disp = String.valueOf(x) + disp + String.valueOf(y);
				System.out.println(disp);
			}
		}
	}
}
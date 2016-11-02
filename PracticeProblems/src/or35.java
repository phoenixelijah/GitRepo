
public class or35 {

	public static void main(String[] args) {
		System.out.print(or35(3));
		System.out.print(or35(5));
		System.out.print(or35(8));

	}
	public static boolean or35(int num){
		if (num%3==0 || num%5==0){
			return true;
		}
		else return false;	
	}

}


public class reverser {

	public static void main(String[] args) {
		String back = backfart("happened");
		System.out.println(back);

	}
	public static String backfart(String str){
		String rev = "";
		//System.out.print(str);
		for (int i = str.length()-1 ; i >= 0; i--){
			char a = str.charAt(i);
			System.out.print(a);
			rev.concat(String.valueOf(a));
		}
		return rev;
	}

}


public class missingChar {

	public static void main(String[] args) {
		System.out.println(missingChar("Hellocoptor", 10));

	}
	
	public static String missingChar(String str, int n){
		String beg = str.substring(0, n);
		String end = "";
		if (n+1 <= str.length()){
			end = str.substring(n+1);
		}
		return beg + end;
	}

}

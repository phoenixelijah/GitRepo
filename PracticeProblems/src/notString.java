
public class notString {
	public static void main(String[] args) {
		String x = notString("broken");
		System.out.println(x);
		String y = notString("not borken");
		System.out.println(y);
		
	}
	
	public static String notString(String str) {
		  if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
		    return str;
		  }
		  
		  return "not " + str;
		}
}
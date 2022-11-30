
public class FindBAinStr {

	public static void main(String[] args) {

		String str = "abababababa";
		 String x ="ba";
		 int count=0;
		for(int i=0; i<str.length(); i++) {
			
			if(i<str.length()-1) {
				String s = str.charAt(i)+""+str.charAt(i+1);
				if(x.equals(s)) {
					count++;
				}
			}
		} 
		System.out.println(count);
		 
	}

}

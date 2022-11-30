
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb1 = new StringBuffer("GFG");
		StringBuffer sb2 = new StringBuffer("GFG");
		String s1 = "GFG";
		String s2 = "GFG";
		sb2=sb1;
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.equals(sb1));
		System.out.println(s1.equals(sb1));
		System.out.println(sb1.equals(sb2));
		


  
	  
	  }
  }
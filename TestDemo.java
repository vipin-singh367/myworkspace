import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List<Integer> list = Arrays.asList(2,1,32,31,20,12, 10,25);
		//list= list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		//System.out.println(list);
		
		String str1 ="Hello";
		String str2="Hello";
		
		String str3= new String("Hello");
		
		
		System.out.println("str1str2 >>> "+(str1==str2));
		System.out.println("str1.equals(str2) >>> "+str1.equals(str2));
		System.out.println("======================================");
		System.out.println("str1str3 >>> "+(str1==str3));
		System.out.println("str1.equals(str3) >>> "+str1.equals(str3));
		//System.out.println(str1.equals(s4));
		System.out.println(str1);
	}

}

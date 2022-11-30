import java.util.TreeSet;

public class FarthestNumberWissen {

	public static void main(String[] args) {
		int[] Arr = {1,2,3,4,5};
		int N=5;
		int[] Arr1 = {-7, -9, 5, 3, 1, 2, 9, 10, 15};
		int N1=9;
		int[] Arr2 = {-7, -9, 5, 3, 1, 2, 9};
		int N2=7;
		int[] Arr3 = {-10, 7, 5, 1};
		int N3=4;
		//memory exceed
		int a = farthestfromzero(N3, Arr3);
		System.out.println(a);
		
		//working fine
		int b= farthestfromzero1(N3, Arr3);
		System.out.println(b);
		

	}
	
	public static int farthestfromzero(int N, int[] Arr) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i = 0; i < N; i++) {
			ts.add(Arr[i]);
		}
		int maxV = ts.last();
		int minV = ts.first();

		if (Math.abs(minV) >= maxV) {
			return minV;
		}
		return maxV;

	}
	
	 public static int farthestfromzero1(int N, int [] Arr) {//You don't really need to store every elements
	        int best = 0;
	        
	        for(int i = 0;i<N;i++) {
	            if(Math.abs(Arr[i]) > Math.abs(best)) {
	                best = Arr[i];
	            }else if(Math.abs(best) == Math.abs(Arr[i]) && best > Arr[i]) {
	                best = Arr[i];
	            }
	        }
	        return best;    
	    }
	

}

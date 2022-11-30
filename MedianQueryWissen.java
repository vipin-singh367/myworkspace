import java.util.Arrays;
import java.util.Scanner;

public class MedianQueryWissen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
            array[i] = input.nextInt();

     /*   Arrays.sort(array);
        int m = (n-1)/2;
        if(n%2==0){
        	
             System.out.println((array[m]+array[m+1])/2);

        }else{
             System.out.println(array[m]);
        }*/
        
		for (int i = 0; i < 3; i++) {
			int l = 0;
			int r = 0;
			if(i==1) {
				l=1;
				r=2;
			}else if(i==2) {
				l=1;
				r=1;
			}
			int res = medianQuery(n, array, l, r);
			System.out.println(res);
		}
        
        
	}
	
	
	public static int medianQuery(int n, int[] arr, int l, int r) {

		int median = 0;
		int[] sub = new int[n - (l + r)];
		int count = 0;
		for (int i = l; i < n - r; i++) {
			sub[count] = arr[i];
			count++;
		}
		Arrays.sort(sub);
		int len = sub.length;
		int m = len/ 2;
		// int m1 = (n1-(l+r))/2;
		if (len % 2 == 0) {
			//System.out.println((sub[m] + sub[m + 1]) / 2);
			median = (sub[m] + sub[m+1]) / 2;
		} else {
			//System.out.println(sub[m-1]);
			median = sub[m];
		}

		return median;

	}	

}

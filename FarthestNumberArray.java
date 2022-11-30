import java.util.ArrayList;

public class FarthestNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//max distnace  and min value like-6 max far min value 5(return idx=7)  same create array
		//res = [7, -1, 5, 7, 7, -1, -1, -1]
		int[] arr = {6,2,4,8,9,3,4,5};
		ArrayList<Integer> res =new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			int resIdx=-1;
			for (int j = arr.length - 1; j >i; j--) {
				if (arr[j] < arr[i]) {
					resIdx = j;
					break;
				}

			}
			res.add(resIdx);
		}
		
		System.out.println(res);

	}

}

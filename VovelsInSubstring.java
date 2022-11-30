package com.codility.epam;

public class VovelsInSubstring {

	public static void main(String[] args) {

		//String str = "abuc";
		String str = "board";
		int len = str.length();
		int ans = 0;
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				int lStrlen = i + 1;
				ans += lStrlen * (len - i);
			}

		}
System.out.println(ans);
	}

}

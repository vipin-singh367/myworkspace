package com.codility.epam;

public class ReverseVowelString {

	public static void main(String[] args) {
		String str="leetcode";
		char[] sChar = str.toCharArray();
		int start=0;
		int end =str.length()-1;
		
		while(start < end) {
			
			while(start < str.length() && !isVowel(str.charAt(start))) {
				start++;
			}
			
			while(end >=0 && !isVowel(str.charAt(end))) {
				end--;
			}
			
			if(start<end) {
				//swap
				char temp = sChar[start];
				sChar[start]=sChar[end];
				sChar[end]=temp;
				start++;
				end--;
			}
			
		}
		System.out.println(str+" -> reverse vowels -> "+ new String(sChar));

	}

	private static boolean isVowel(char ch) {
		// TODO Auto-generated method stub
		return (ch =='a' || ch=='e' || ch =='i' || ch=='o' || ch=='u' || ch =='A' || ch=='E' || ch =='I' || ch=='O' || ch=='U');
	}

}

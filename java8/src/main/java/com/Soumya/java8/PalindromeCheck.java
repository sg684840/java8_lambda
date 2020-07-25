package com.Soumya.java8;
import java.util.*;

public class PalindromeCheck {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n=scan.nextInt();
		ArrayList< String > words = new ArrayList< String >(n);    
		ArrayList<String> palwords=new ArrayList<String>(n);
		System.out.print("Enter the words:");
        for(int i=0;i<n;i++)     
           words.add(scan.next());
        for(String ele:words) {
        	if(isPalindrome(ele)) {
        		palwords.add(ele);
        	}
        }
        System.out.println("The list of palindromic words are:\n"+palwords);
	}
	
	static boolean isPalindrome(String w)
    {
		int i,n=w.length();
		for(i=0;i<n;i++) {
			if(w.charAt(i)!=w.charAt(n-i-1))
				return false;
		}
		return true;
    }

}

package com.Soumya.java8;
import java.util.*;
import java.util.stream.Collectors;


public class StringOfMylist {

	private static Scanner sc;
	public static void main(String[] args)throws Exception{
		sc = new Scanner(System.in);
		System.out.print("Enter size of list: ");
		int n=sc.nextInt();
		final List<String> s = new ArrayList<>();
		System.out.print("Enter the names: ");
		for(int i=0;i<n;i++) {
			s.add(sc.next());}
		System.out.println("The Names Starting with letter 'A' or 'a' and of 3 letters are: ");
		List<String> s1=filter(s,"a");
		List<String> s2=filter(s,"A");
		for(String x: s1) {
			if(x.length()==3) {
				System.out.println(x);
			}
		}
		for(String x:s2) {
			if(x.length()==3)
				System.out.println(x);
		}
	}
	private static List<String> filter(final Collection<String> source, final String prefix) {
	    return source.stream().filter(item -> item.startsWith(prefix)).collect(Collectors.toList());
	}

}

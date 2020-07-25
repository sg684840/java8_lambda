package com.Soumya.java8;
import java.util.*;

public class Arraylistavg {
		
		private static Scanner sc;

		public static void main(String args[]) {
			sc = new Scanner(System.in);
			System.out.print("Enter the size of the list: ");
			int n=sc.nextInt();
			int i;
			ArrayList<Integer> arr=new ArrayList<Integer>(n);
			Arraylistavg obj=new Arraylistavg();
			System.out.print("Enter the Elements in the list:");
			for(i=0;i<n;i++)
			{
				int x=sc.nextInt();
				arr.add(x);}
				System.out.println("Average is :"+obj.calculateAverage(arr));
			
		}
		
		private double calculateAverage(List <Integer> arr) {
			OptionalDouble average = arr.stream()
		            .mapToDouble(a -> a)
		            .average();
			return average.isPresent() ? average.getAsDouble() : 0; 
			}
	}

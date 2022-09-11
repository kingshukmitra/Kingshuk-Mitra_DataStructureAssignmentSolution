package question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the total no of floors in the building");
		
		int floorCount = sc.nextInt();

	    int[] floorSizes = new int[floorCount];
		
	   
		for(int i=0; i<floorCount; i++)  
		{  
		System.out.println("enter the floor size given on day : "+(i+1));
		floorSizes[i] = sc.nextInt(); 
		}  
		System.out.println();
		
		ConstructFloors cf = new ConstructFloors();
		cf.floorConstructor(floorSizes, floorCount);
		
		sc.close();
	}

}

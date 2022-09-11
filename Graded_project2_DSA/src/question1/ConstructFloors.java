package question1;

import java.util.PriorityQueue;

public class ConstructFloors {
	
	public void floorConstructor(int floorSizes[], int floorCount) {
		
		System.out.println("The order of construction is as follows:");
		
		
		PriorityQueue<Integer> pQueue = new PriorityQueue<>(java.util.Collections.reverseOrder());

		int[] tempArr = new int[floorCount];

		int maxFloors = floorCount;

		System.out.println();
		for (int i = 0; i < floorCount; i++) {

			System.out.println("Day: "+(i+1));
			
			
			tempArr[i] = floorSizes[i];

			pQueue.add(tempArr[i]);


			while (!pQueue.isEmpty() && pQueue.peek() == maxFloors) {

				System.out.print(pQueue.poll() + " ");

				maxFloors=maxFloors-1;

			}

			System.out.println();

		}

	  }

}

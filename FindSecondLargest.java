package week3.day2.assignments.mandatory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class FindSecondLargest {

	public static void main(String[] args) {
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		int[] data = {3,2,11,4,6,7};
		List<Integer> secondLarge=new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {
			secondLarge.add(data[i]);
		}
		System.out.print("Before Sort"+secondLarge);
		//sort it
		Collections.sort(secondLarge);
		System.out.println("\n Second Larget Number is \t" +secondLarge.get(secondLarge.size()-2));
	}

}

package com.hcl.longestincreasingsubsequence;

import java.util.ArrayList;
import java.util.Random;

public class GenerateRandomArray {
	
	public ArrayList<Integer> generateRandomArray(int numOfElements) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		
		for(int i =0; i < numOfElements; i++) {
			list.add(random.nextInt(99));
		}
		return list;
		
	}

}

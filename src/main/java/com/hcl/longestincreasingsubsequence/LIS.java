package com.hcl.longestincreasingsubsequence;

import java.util.ArrayList;
import java.util.Random;

public class LIS {
	
	public ArrayList<Integer> generateRandomArray(int numOfElements) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		// list populated with randomly generated numbers between 0 - 99
		for(int i =0; i < numOfElements; i++) {
			list.add(random.nextInt(99));
		}
		return list;
		
	}
	
	public ArrayList<Integer> seqOfLIS(ArrayList<Integer> nums) {
	    if(nums.isEmpty() || nums.size() == 0)
	        return nums;// if list is empty, LIS will be empty 
	 
	    ArrayList<Integer> list = new ArrayList<>(); 
	    int num = 0;
	    for(int z = 0; z < nums.size(); z++){
	    	num = nums.get(z);
	        if(list.size()==0 || num>list.get(list.size()-1)){
	            list.add(num); // appending if the num is greater than the last element on the list
	        }else{ // doing binary search to replace the element on the list
	            int i=0; 
	            int j=list.size()-1;
	 
	            while(i<j){
	                int mid = (i+j)/2;
	                if(list.get(mid) < num){
	                    i=mid+1;// setting the i value 
	                }else{
	                    j=mid;// if mid is greater than the num, j becomes the mid, checking on the left of the nums
	                }
	            }
	 
	            list.set(j, num);
	        }
	    }
	    
	    return list;
	    
	}

}

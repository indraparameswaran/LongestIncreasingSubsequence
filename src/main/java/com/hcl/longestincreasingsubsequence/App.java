package com.hcl.longestincreasingsubsequence;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
    	LIS ra = new LIS();
    	ArrayList<Integer> randomNumList = ra.generateRandomArray(10);
    	
    	System.out.println("Randomly Generated Sequence List: ");
    	for(int i =0; i < randomNumList.size(); i++) {
    		System.out.print(randomNumList.get(i) + " ");
    	}
    	
    	//working example
    	
//    	ArrayList<Integer> randomNumList = new ArrayList<Integer>();
//    	
//    	randomNumList.add(39);
//    	randomNumList.add(40);
//    	randomNumList.add(43);
//    	randomNumList.add(68);
//    	randomNumList.add(59);
//    	randomNumList.add(25);
//    	randomNumList.add(57);
//    	randomNumList.add(16);
//    	randomNumList.add(68);
//    	randomNumList.add(16);
    	
    	//int lengthOfLIS = ra.lengthOfLIS(randomNumList);
    	
    	//System.out.println("Length Of Longest Increasing Subsequence: " + lengthOfLIS);
    	
    	ArrayList<Integer> listOfLIS = ra.seqOfLIS(randomNumList);
    	
    	System.out.println("\nLongest Increasing Subsequence: ");
    	for(int j = 0; j < listOfLIS.size(); j++) {
    		System.out.print(listOfLIS.get(j)+" ");
    	}
    	
    }
   
}

// 39,40,43,68,59,25,57,16,68,16   --> to form a new list --> append if the num is greater than the last element on the new list,
//replace the smallest element of the list that is greater than the num, if the num is smaller than the
//last element on the list
/*
list = (39) ->
list =(39, 40) ->
list = (39,40, 43) ->
list =(39, 40, 43, 68) ->
list = (39,40,43,59) ->
list = (25 40 43 59) -> 
list = (25, 40, 43, 57)  ->
list = (16,40,43, 57)  ->
list =(16, 40, 43, 57) ->
list = (16, 40,43, 57, 68)  ->
list = (16, 40, 43, 57, 68)

*/
package com.hcl.longestincreasingsubsequence;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
    	GenerateRandomArray ra = new GenerateRandomArray();
    	ArrayList<Integer> randomNumList = ra.generateRandomArray(10);
    	
    	for(int i =0; i < randomNumList.size(); i++) {
    		System.out.println(randomNumList.get(i));
    	}
    	
    }
}

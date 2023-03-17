package com.generics;

import java.util.ArrayList;
import java.util.List;

public class MyDemo {
	 public static void main(String[] args) {
			
		 List<Integer> list=new ArrayList<>();
		 list.add(11);
		 list.add(12);
		 addElementsToList(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		} 
		Integer[] nums=new Integer[5];
		nums[0]=22;
		 addElementToNums(nums);
	 }
	 private static void addElementsToList(List l) {
		 l.add(13);
		 l.add("Kalpana");
	 }
	 private static void addElementToNums(Object[] nums) {
		 nums[1]=14;
		 nums[2]="Ithagoni";
	 }
}

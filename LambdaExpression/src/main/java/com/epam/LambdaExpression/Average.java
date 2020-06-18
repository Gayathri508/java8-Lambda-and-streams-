package com.epam.LambdaExpression;


import java.util.*;
import java.util.stream.Collectors;
public class Average {

	public static double Average(List<Integer> list) {
		IntSummaryStatistics stats = list.stream().mapToInt((x) -> x).summaryStatistics();
		return stats.getAverage();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {2,5,8,10,12,24};
		List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
		double average=Average(list);
		System.out.println("Average of given numbers is = "+average);
		
	}

}

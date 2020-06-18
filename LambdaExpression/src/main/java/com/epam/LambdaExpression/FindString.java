package com.epam.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindString {
public static List<String> find(List<String> list){
	return list.stream().filter(x -> x.startsWith("a")).filter(x -> x.length() == 3).collect(Collectors.toList());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strarray= {"","abc","aaa","bac","ab","a","dsa","aab","abcdef"};
		List<String> list=Arrays.asList(strarray);
		List<String> reqlist=find(list);
		System.out.println("The strings whose size is 3 and start with 'a' are");
		for(String s:reqlist) {
			System.out.println(s);
		}
	}

}

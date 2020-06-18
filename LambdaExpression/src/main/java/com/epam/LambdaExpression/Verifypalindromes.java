package com.epam.LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Verifypalindromes {

	public static List<String> findpalindrome(List<String> list){
		List<String> reqlist=new ArrayList<>();
		for(String s:list) {
			int f=0;
			int start= 0;
			int end= s.length() - 1;
			while (end > start) {
			    if (s.charAt(start) != s.charAt(end)) {
			        f=1;
			    }
			    ++start;
			    --end;
			}
			if(f==0) {
				reqlist.add(s);
			}
		}
		return reqlist;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strarray= {"","aba","aaa","bac","abb","a","bba","aab","abcdef","aacbcaa","aa","zdfgh"};
		List<String> list=Arrays.asList(strarray);
		List<String> reqlist=findpalindrome(list);
		System.out.println("The palindromic strings in the given list are");
		for(String s:reqlist) {
			System.out.println(s);
		}

	}

}

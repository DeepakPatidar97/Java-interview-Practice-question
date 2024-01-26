package com.collections;

import java.util.ArrayList;
import java.util.List;

public class AddingToOtherCollection {
	
	public static void main(String[] args) {
		List<String> ls1 =  new ArrayList<>();
		ls1.add("a");
		ls1.add("b");
		
		List<String> ls2 = new ArrayList<>();
		ls2.add("c");
		ls2.add("d");
		
		ls1.addAll(ls2);
		System.out.println(ls1);
	}
}

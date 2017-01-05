package com.test.collection;

import java.util.*;
public class ArrayCollection {

	public static void main(String[] args) {
	ArrayList<String> a = new ArrayList<String>();
	a.add("Bhavya");
	a.add("Milind");
	a.add("Manu");
	
	Iterator i = a.iterator();
	
	while(i.hasNext()){
		System.out.println(i.next());
	}
	

	}

}

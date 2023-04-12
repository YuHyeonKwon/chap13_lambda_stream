package com.javalab.stream02;

import java.util.ArrayList;

public class ArrayListExample { // class s

	public static void main(String[] args) { // main s

		ArrayList<String> myList = new ArrayList<String>();
		
		myList.add("사과");
		myList.add("바나나");
		myList.add("체리");
		myList.add("오렌지");
		
		myList.stream().forEach(name -> System.out.println(name));
	} // main e

} // class e

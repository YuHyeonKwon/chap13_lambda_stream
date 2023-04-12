package com.javalab.stream01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Stream01 { // class s

	public static void main(String[] args) { // main s

		Set<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("김자가");
		set.add("정명훈");
		set.add("김채훈");
		              
		Stream<String> stream = set.stream();
		stream.forEach(name -> System.out.println(name));	// name은 변수 사용자가 지정하면된다.
		
	} // main e

} // class e

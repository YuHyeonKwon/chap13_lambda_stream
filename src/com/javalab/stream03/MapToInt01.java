package com.javalab.stream03;

import java.util.Arrays;
import java.util.List;

public class MapToInt01 { // class s

	public static void main(String[] args) { // main s

		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30)
				);
		
		studentList.stream()		// stream() 반복자와 비슷.	Stream<Student> 객체가 만들어짐
			.mapToInt(s -> s.getScore())		// 학생의 점수로만 된 IntStream 생성
			// .mapToInt(Student :: getScore)	// 학생의 점수로만 된 IntStream 생성		// :: 이중콜론연산자
			.forEach(score -> System.out.println(score));
	} // main e

} // class e

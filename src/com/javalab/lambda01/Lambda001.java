package com.javalab.lambda01;
/**
 * [람다식 미사용]
 * - 람다식이 없는 일반적이 형태의 메소드 사용 방법 예제
 */
public class Lambda001 { // class s

	public static void main(String[] args) { // main s

		int max = 0;	// 임시변수 선언과 동시에 초기화
		
		max = max(2, 3);
		System.out.println(max);
	} // main e
	
	public static int max(int a, int b) {
		return a > b ? a : b;
	}

} // class e

package programmers;

import java.util.*;
import java.math.*;

public class Square {
	public static long solution(long n) {
		long answer = 0;
		
		answer = (long)Math.sqrt(n);
		if(Math.pow(answer, 2)==n) {
			return (long) Math.pow(answer+1, 2);
		}
		else
			return -1;
	}
	public static void main(String[] args) {
		long n=5;
		System.out.println(solution(n));
	}
}

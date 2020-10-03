package programmers;

import java.util.Arrays;
import java.util.Collections;

public class IntDesc {
	public static long solution(long n) {
		long answer = 0;
		String s = Long.toString(n);
		char[] ch = s.toCharArray();

		Arrays.sort(ch);
		StringBuffer sb = new StringBuffer(new String(ch));
		answer = Long.parseLong(sb.reverse().toString());
		return answer;
	}
	public static void main(String[] args) {
		long n =118372L;
		long a = solution(n);
		System.out.println(a);
		
	}
}

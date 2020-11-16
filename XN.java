package programmers;

import java.util.Scanner;

public class XN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,n;
		x = sc.nextInt();
		n = sc.nextInt();
		solution(x,n);
	}
	static long[] solution(int x,int n) {
		long[] answer= new long[n];
		int temp = x;
		for(int i=0;i<n;i++) {
			answer[i]=x;
			x += temp;
			System.out.println(answer[i]);
		}
		
		return answer;
	}
}

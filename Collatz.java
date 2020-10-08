package programmers;

import java.util.Scanner;

class Solution{
	public int solution(long num) {
		for(int i=0;i<500;i++) {
			if(num == 1) {
				return i;
			}
			num = (num%2==0?num/2:num*3+1);
		}
		return -1;
	}
}
public class Collatz {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		Solution s = new Solution();
		System.out.println(s.solution(n));
	}
}

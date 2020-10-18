package programmers;

import java.util.Scanner;

public class CenterChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(solution(input));
	}
	static String solution(String s) {
		String answer="";
		int center;
		if(s.length()%2==0) {
			center=(s.length())/2;
			answer = s.substring(center-1, center+1);
		}
		else {
			center=(s.length())/2;
			answer=s.substring(center, center+1);
		}
		return answer;
	}
	
}

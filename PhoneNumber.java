package programmers;

import java.util.*;
public class PhoneNumber {
	public static String solution(String phone_number) {
		String answer="";
		int len = phone_number.length();
		for(int i=0;i<len-4;i++) {
			answer=answer+"*";
		}
		return answer+phone_number.substring(len-4);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		String phone;
		phone = solution(num);
		System.out.println(phone);
	}
}

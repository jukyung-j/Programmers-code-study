package programmers;


public class Hashard {
	public static void main(String[] args) {
		int x = 11;
		System.out.println(solution(x));
	}
	public static boolean solution(int x) {
		boolean answer = true;
		int result=0,temp = x;
		while(temp>0) {
			result += temp%10;
			temp /= 10;
		}
		answer = (x%result==0?true:false);
		return answer;
	}
}


package programmers;

public class SumDigits {
	public static int solution(int n) {
		int answer=0;
		int a =10;
		while(n%a==n) {
			answer += (n%a)/(a/10);
			System.out.println("answer:"+answer);
			a *= 10;
		}
		return answer;
	}
	public static void main(String[] args) {
		int n = 987;
		System.out.println(solution(n));
	}
}

package programmers;

public class Lcm {
	public static int[] solution(int n,int m) {
		int[] answer = {1,1};
		for(int i = 1;i<=n;i++) {
			if(n%i==0&&m%i==0) {	// 최대공약수
				answer[0] *= i;
				n /= i;
				m /= i;
				if(i!=1)
					i=0;
			}
		}
		answer[1]=answer[0]*n*m;	// 최소공배수
		return answer;
	}
	public static void main(String[] args) {
		int n = 8;
		int m = 12;
		
		for(int i:solution(n,m))
			System.out.println(i);
	}
}

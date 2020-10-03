package programmers;


public class FlipNum {
		public static int[] solution(long n) {
			int[] answer = new int[String.valueOf(n).length()];
			int index = 0;
			
			int temp = 0;
			while(n>0) {
				temp = (int) (n%10);
				n = n/10;
				answer[index] = temp;
				index ++;
			}
			return answer;
		}
	public static void main(String[] args) {
		long n=90000082L;
		int[] a=solution(n);
	}
}

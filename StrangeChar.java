package programmers;

public class StrangeChar {
	public static String solution(String s) {
		String answer="";
		char[] ch = s.toCharArray();
		int n=0;
		
		for(int i=0;i<s.length();i++) {
			if(ch[i]==' ') {
				n=0;
				continue;
			}
			else
				ch[i]=(n%2==0?Character.toUpperCase(ch[i]):Character.toLowerCase(ch[i]));
			n++;
		}
		answer=String.valueOf(ch);
		return answer;
	}
	public static void main(String[] args) {
		String s = "try hello world";
		System.out.println(solution(s));
	}
	
}

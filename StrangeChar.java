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
			if(n%2==0) {
				if(ch[i]>='a' && ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
				n++;
			}
			else {
				if(ch[i]>='A' && ch[i] <='Z')
					ch[i]=(char)(ch[i]+32);
				n++;
			}
		}
		answer=String.valueOf(ch);
		return answer;
	}
	public static void main(String[] args) {
		String s = "try hello world";
		System.out.println(solution(s));
	}
	
}

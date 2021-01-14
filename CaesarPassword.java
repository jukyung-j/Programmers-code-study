package programmers;

public class CaesarPassword {
	public static void main(String[] args) {
		String s ="AB";
		solution(s,1);
	}
	public static String solution(String s,int n) {
		String answer="";
		String[] split = s.split("");
		char ch;
		int temp = 0;
		for(int i=0;i<split.length;i++) {
			ch = split[i].charAt(0);
			if(ch==' ') {
				answer += ch;
				continue;
			}
			if(ch=='z')
				temp = (ch%122)+96+n;
			else if(ch=='Z')
				temp = (ch%90)+64+n;
			else {
				temp = ch+n;
				if(temp>122) {
					temp = temp%122+96;
				}
				else if(temp>90&&temp-n<90) {
					temp = temp%90+64;
				}
			}
			ch = (char)temp;
			temp=0;
			answer += ch;
		}
		System.out.println(answer);
		return answer;
	}
}

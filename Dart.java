package programmers;

import java.util.*;
import java.util.regex.Pattern;

public class Dart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dartResult = sc.nextLine();
		solution(dartResult);
	}
	static int solution(String dartResult) {
		   int answer = 0;
	       int index=-1,j=0;
			String[] dart = dartResult.split("");
			String[] num = dartResult.split("S|D|T|\\*|#");
			int[] desc=new int[3];
			
			for(int i=0;i<num.length;i++) {
				if(num[i].equals(""))
					i++;
				desc[j] = Integer.parseInt(num[i]);
				j++;
			}
			for(int i=0;i<dart.length;i++) {
				switch(dart[i]) {
				case "S":
					index++;
					desc[index] = (int) Math.pow(desc[index], 1);
					break;
				case "D":
					index++;
					desc[index] = (int) Math.pow(desc[index], 2);
					break;
				case "T":
					index++;
					desc[index] = (int) Math.pow(desc[index], 3);
					break;
				case "*":
					if(index==0) 
						desc[index] = desc[index]*2;
					else {
						desc[index-1] = desc[index-1]*2;
						desc[index] = desc[index]*2;
					}
					break;
				case "#":
					desc[index] = desc[index]*-1;
					break;
				
				}
				
			}
			answer = desc[0]+desc[1]+desc[2];
			System.out.println("answer:"+answer);
			return answer;
	}
}


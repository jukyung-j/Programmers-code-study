package programmers;

public class Average {
	 public double solution(int[] arr) {
	        double answer = 0;
	        double result=0;
		 
	        for(int i=0;i<arr.length;i++){
	            result+=arr[i];
	        }
	        answer = (double)result/arr.length;
	        return answer;
	    }
}

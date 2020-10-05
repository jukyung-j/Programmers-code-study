package programmers;

public class RemoveMinNum {
	static int[] solution(int[] arr) {
		int[] answer= {};
		int j = 0,k=0;
		int min=arr[0],index=0;
		answer = new int[arr.length];
		
		if(arr.length==1) {
			answer[0]=-1;
			return answer;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
				index = i;
			}
		}
		answer = new int[arr.length-1];
		while(k<arr.length) {
			
			if(arr[k]==min) {
				if(k==arr.length-1)
					break;
				k++;
			}
			answer[j]=arr[k];
			j++;k++;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		int[] arr = {4,3,1,2,5};
		for(int i:solution(arr)) {
			System.out.println(i);
		}
	}
}

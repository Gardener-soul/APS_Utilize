import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 백트래킹_03_순열3 {
	
	public static int[] nums; //배열 저장을 할거구
	public static int N; 	  //원소 수
	public static int[] result;
	public static boolean[] visited;
	
	public static void main(String[] args) {
		nums = new int[] {0,1,2};
		N = nums.length;
		result = new int[N];
		visited = new boolean[N];
		
	
		
	}
	
	//idx : 현재 판단 위치
	public static void perm(int idx) {
		
		if(idx == N) {

			System.out.println(Arrays.toString(result));
			return;
			
		}
		
		//사용할 수 있는 모든 원소를 체크
		for(int i=0; i<N; i++) {
			if(visited[i]) continue; //이미 사용한 원소라면 (True라면 쳐내기)
			
			result[idx] = nums[i]; //해당 i번째의 원소를 저장
			visited[i] = true;		//i번째 원소 사용했다고 표시
			perm(idx+1);
			visited[i] = false;		//i번째 원상복구
		}
		
	}
}

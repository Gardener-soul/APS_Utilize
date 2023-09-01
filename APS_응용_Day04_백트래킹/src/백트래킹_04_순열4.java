import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 백트래킹_04_순열4 {
	
	public static int[] nums; //배열 저장을 할거구
	public static int N; 	  //원소 수
	public static int[] result;
	
	public static void main(String[] args) {
		nums = new int[] {0,1,2};
//		nums = new int[] {0,1,1,2}; //중복된 값을 어떻게 제거할 것인가
		N = nums.length;
		result = new int[N];
		
		perm(0,0);
	
		
	}
	
	//idx : 현재 판단 위치
	public static void perm(int idx, int visited) {
		
//		if(visited == (1<<N) - 1 ) //이 표현이 N개의 비트가 1로  가득차있는 상태
		if(idx == N) {

			System.out.println(Arrays.toString(result));
			return;
			
		}
		
		//사용할 수 있는 모든 원소를 체크
		for(int i=0; i<N; i++) {
			//해당 원소 썼니?
			if((visited & (1<<i)) > 0) continue;
			result[idx] = nums[i]; //결과 저장
			perm(idx+1, visited | (1<<i));
			
		}
		
	}
	
	//nums 배열을 static하게 선언했기 때문에 인덱스만을 인자로 받아서 처리 가능.
	public static void swap(int a, int b) {
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	}
	
}

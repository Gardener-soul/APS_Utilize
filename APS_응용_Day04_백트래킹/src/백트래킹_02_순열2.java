import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 백트래킹_02_순열2 {
	
	public static int[] nums; //배열 저장을 할거구
	public static int N; 	  //원소 수
	public static List<int[]> List;
	
	public static void main(String[] args) {
		nums = new int[] {0,1,2};
		N = nums.length;
		List = new ArrayList<>();
		
		perm(0);
		
		for(int[] a :List) {
			System.out.println(Arrays.toString(a));
		}
		
	}
	
	//idx : 현재 판단 위치
	public static void perm(int idx) {
		
		if(idx == N) {

			// List.add(nums); 주소를 담아버리니 클래스 배열이 된 nums의 값이 계속해서 담아옴
			
			//깊은 복사의 과정이 필요함.
			int[] tmp = new int[N];
			for(int i=0; i<N; i++) {
				tmp[i] = nums[i];
			}
			List.add(tmp);
			
			System.out.println(Arrays.toString(nums));
			return;
		}
		
		for(int i=idx; i<N; i++) {
			swap(i, idx);
			perm(idx+1);
			swap(i,idx);
		}
		
	}
	
	//nums 배열을 static하게 선언했기 때문에 인덱스만을 인자로 받아서 처리 가능.
	public static void swap(int a, int b) {
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	}
	
}

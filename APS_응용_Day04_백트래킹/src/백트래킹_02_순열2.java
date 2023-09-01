import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ��Ʈ��ŷ_02_����2 {
	
	public static int[] nums; //�迭 ������ �Ұű�
	public static int N; 	  //���� ��
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
	
	//idx : ���� �Ǵ� ��ġ
	public static void perm(int idx) {
		
		if(idx == N) {

			// List.add(nums); �ּҸ� ��ƹ����� Ŭ���� �迭�� �� nums�� ���� ����ؼ� ��ƿ�
			
			//���� ������ ������ �ʿ���.
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
	
	//nums �迭�� static�ϰ� �����߱� ������ �ε������� ���ڷ� �޾Ƽ� ó�� ����.
	public static void swap(int a, int b) {
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	}
	
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ��Ʈ��ŷ_04_����4 {
	
	public static int[] nums; //�迭 ������ �Ұű�
	public static int N; 	  //���� ��
	public static int[] result;
	
	public static void main(String[] args) {
		nums = new int[] {0,1,2};
//		nums = new int[] {0,1,1,2}; //�ߺ��� ���� ��� ������ ���ΰ�
		N = nums.length;
		result = new int[N];
		
		perm(0,0);
	
		
	}
	
	//idx : ���� �Ǵ� ��ġ
	public static void perm(int idx, int visited) {
		
//		if(visited == (1<<N) - 1 ) //�� ǥ���� N���� ��Ʈ�� 1��  �������ִ� ����
		if(idx == N) {

			System.out.println(Arrays.toString(result));
			return;
			
		}
		
		//����� �� �ִ� ��� ���Ҹ� üũ
		for(int i=0; i<N; i++) {
			//�ش� ���� ���?
			if((visited & (1<<i)) > 0) continue;
			result[idx] = nums[i]; //��� ����
			perm(idx+1, visited | (1<<i));
			
		}
		
	}
	
	//nums �迭�� static�ϰ� �����߱� ������ �ε������� ���ڷ� �޾Ƽ� ó�� ����.
	public static void swap(int a, int b) {
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	}
	
}

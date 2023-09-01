import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ��Ʈ��ŷ_03_����3 {
	
	public static int[] nums; //�迭 ������ �Ұű�
	public static int N; 	  //���� ��
	public static int[] result;
	public static boolean[] visited;
	
	public static void main(String[] args) {
		nums = new int[] {0,1,2};
		N = nums.length;
		result = new int[N];
		visited = new boolean[N];
		
	
		
	}
	
	//idx : ���� �Ǵ� ��ġ
	public static void perm(int idx) {
		
		if(idx == N) {

			System.out.println(Arrays.toString(result));
			return;
			
		}
		
		//����� �� �ִ� ��� ���Ҹ� üũ
		for(int i=0; i<N; i++) {
			if(visited[i]) continue; //�̹� ����� ���Ҷ�� (True��� �ĳ���)
			
			result[idx] = nums[i]; //�ش� i��°�� ���Ҹ� ����
			visited[i] = true;		//i��° ���� ����ߴٰ� ǥ��
			perm(idx+1);
			visited[i] = false;		//i��° ���󺹱�
		}
		
	}
	
	//nums �迭�� static�ϰ� �����߱� ������ �ε������� ���ڷ� �޾Ƽ� ó�� ����.
	public static void swap(int a, int b) {
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	}
	
}

import java.util.Arrays;

public class �κ�����_02 {
	public static String[] ��� = {"����","���","��","��ġ"};
	
	
	public static void main(String[] args) {
		int N = 4;
		int[] sel = new int [N];
		
		//i�� ��� �κ������̴�.
		for(int i=0; i<(1<<N); i++) {
			System.out.println(i);
			//��� �˻縦 ����.
			
			//��Ʈ �������� �ű� Ƚ��
			for(int j=0; j<N; j++) {
				if((i & (1<<j)) > 0) {
					System.out.print(���[j]);
				}
				System.out.print(" ���");
			}
			
		}
	}
	
}

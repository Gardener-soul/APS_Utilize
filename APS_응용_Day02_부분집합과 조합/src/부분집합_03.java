import java.util.Arrays;

public class �κ�����_03 {
	public static String[] ��� = {"����","���","��","��ġ"};
	public static int N=4;
	//ó���� False�� �ʱ�ȭ
	public static boolean[] sel = new boolean[N];
	
	public static void main(String[] args) {
		powerset(0);
		
	}
	
	//idx : �ش� ��° ��ġ �Ǵ�
	public static void powerset(int idx) {
		// ����Լ����� ������Ʈ�� �����Ʈ�� �з�
		
		// ������Ʈ : ���� �� ��͸� ������ �κ�
		if(idx==N) { //��� ������ ���� �� �Ǵ��ߴ�. (������ ����)
			for(int i=0; i<N; i++) {
				if(sel[i]) {
					System.out.print(���[i]);
				} 
			}
			System.out.println();
			return;
		}
		// �����Ʈ : ����ؼ� ���� ȣ���ϴ� ���� �ִ�.
		sel[idx] = false;
		powerset(idx+1);
		
		sel[idx] = true;
		powerset(idx+1);
		
	}
	
}

import java.util.Arrays;

public class ����_01 {
	public static String[] ���� = {"����", "��Ƽ", "�丶��","ġ��","����"};
	public static int N = 5;
	public static int R = 2; //�������� �Ǵ��� �� �ִ� �κе�
	public static String[] sel = new String[R]; //���� ������ ����
	
	public static void main(String[] args) {
		
		combination(0,0);
		
	}
	
	//idx : ���� ������ idx , sidx�� sel�� index
	public static void combination(int idx, int sidx) {
		//������Ʈ
		if(sidx == R) {
			System.out.println(Arrays.toString(sel));
			return;
		}

		//������ sidx���� �츮�� �ʿ��� 2���� ���յ��� �� �ɷ�����.
		// �츮�� �ʿ��� 2���� ���� (sidx�� ���� ���� ���ξ���Ѵ�.)
		if(idx==N) return; 
		
		//�����Ʈ
		sel[sidx] = ����[idx];  		//�ش� ��� �־��.
		combination(idx+1, sidx+1); //idx��° ��� ������
		
//		sel[sidx] = null; //�Ȼ�����
		combination(idx+1, sidx); // idx��° ��� �� ������ ,, �׷� ���࿡ 3�� ������,,, 

	}
	
}

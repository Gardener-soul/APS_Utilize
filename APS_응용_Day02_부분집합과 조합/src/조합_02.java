import java.util.Arrays;

public class ����_02 {
	public static String[] ���� = {"����", "��Ƽ", "�丶��","ġ��","����"};
	public static int N = 5;
	public static int R = 2; //�������� �Ǵ��� �� �ִ� �κе�
	public static String[] sel = new String[R]; //���� ������ ����
	
	public static void main(String[] args) {
		
		combination(0,0);
		
	}
	
	//idx : ������ ���� index, sidx�� sel�� index
	public static void combination(int idx, int sidx) {
		//������Ʈ
		if(sidx == R) {
			System.out.println(Arrays.toString(sel));
			return;
		}
						//��輳��
		for(int i=idx; i<N-R+sidx; i++) {
			sel[sidx] = ����[i];
			combination(i+1, sidx+1);
		}

	}
	
}

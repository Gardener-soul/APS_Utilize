
public class ��������_02_�ŵ�����_��� {
	
	static int C;
	static int N;
	
	public static void main(String[] args) {
		
		C = 2;
		N = 10;
		
		System.out.println(pow(C,N));
		pow(C,N);
		
	}
	
	public static int pow(int C, int N) {
		
		//��������
		if(N==1) return C;
		
		//�������
		return C*pow(C, N-1);
		
		//�޸������̼�  : ���� ����� �迭�� �����ϴ� ��. �̹� �� ���� �迭�� ����Ǿ������� �迭�� ���� �����Ѵ�.
		
		//¦���� ��
//		if(N%2==0) {
//			return pow(C,N/2) * pow(C,N/2);
//		}
//		else { //Ȧ�� �� ��
//			return pow(C,(N-1)/2) * pow(C,(N-1)/2) * C;
//		}
		
	}
	
//	public static int pow2(int C, int N) {
//		//���� ���� ��� �ʹ� ��ȿ�����̴�.
//		//�Ȱ��� ������ �� ���� �ʵ���  �ڵ带 �����غ���.
//		
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

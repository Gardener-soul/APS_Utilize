
public class ��������_01_�ŵ�����_�ݺ��� {
	
	static int C;
	static int N;
	
	public static void main(String[] args) {
		
		C = 2;
		N = 10;
		
		System.out.println(Cgob(2,10));
		
	}
	
	//�ŵ������� ���ϴ� �ݺ����� �̿��� �޼��带 ������.
	
	//Factorial�� ���ߴ� ��ó�� ����Լ��� �̿��ؼ��� ���غ���.
	
	static int Cgob(int C, int N) {
		
		if(N==0) {
			return 1;
		}
		
		return C*Cgob(C,N-1);
		
	}
	
}

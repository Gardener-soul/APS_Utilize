
public class Start_01_��Ʈ������ {

	public static void main(String[] args) {
		
		// & �� ��Ʈ�� 1�̸� 1�� �����, �ƴϸ� 0�� �����
		// &�� Ȱ�� : �ش� ��Ʈ�� �ֳ���?
		System.out.println(3 & 5);
		
		// | �ϳ��� ��Ʈ�� 1�̸� 1�� ����� �ƴϸ� 0�� �����
		// |�� Ȱ�� : �ش� ��Ʈ ����!
		System.out.println(3 | 5);
		
		// ^ : XOR ������ 0, �ٸ��� 1
		System.out.println(3^5);
		
		// ~ : ���� �����ڷν� �ǿ������� ��� ��Ʈ�� ������Ų��.
		System.out.println(~4);
		
		// A << B : A�� ��Ʈ�� �������� B�� �����̰ڴ�.
		// �� �� ������ ������ 2�辿 Ŀ����.
		System.out.println(3 << 2);
		
		// A >> B : A�� ��Ʈ�� ���������� B�� �����̰ڴ�.
		// �� �� ������ ������ 2�辿 �۾�����.
		System.out.println(12>>2);
		System.out.println(13>>1); // �Ҽ����� ����.
		
		//32���� �ٽ� �ʱ�ȭ�Ǵ� ����.
		System.out.println(3 << 32);
	}
	
}

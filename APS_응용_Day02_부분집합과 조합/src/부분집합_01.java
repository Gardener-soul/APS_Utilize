import java.util.Arrays;

public class �κ�����_01 {
	public static String[] ��� = {"����","���","��","��ġ"};
	
	
	public static void main(String[] args) {
		int N = 4;
		int[] sel = new int [N];
				
		//������ N�� �ݺ��� ����ؾ���
		for(int a=0; a<2; a++) {
			sel[0] = a;
			for(int b=0; b<2; b++) {
				sel[1]=b;
				for(int c=0; c<2; c++) {
					sel[2]=c;
					for(int d=0; d<2; d++) {
						sel[3]=d;
						System.out.println(Arrays.toString(sel));
						for(int i=0; i<N; i++) {
							if(sel[i]==1) {
								System.out.print(���[i]);
							}
						}
						System.out.println(" ���");
					}
				}
			}
		}
		
	}
	
}

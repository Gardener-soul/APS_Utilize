
public class ��Ʈ��ŷ_01_����1 {
	
	public static void main(String[] args) {
		
		int[] cards = { 3, 4, 5 };
		int N = cards.length;

		// ������ �ݺ����� �̿��ؼ� ������~~
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i != j) {
					for (int k = 0; k < N; k++) {
						if (k != i && k != j) {
							System.out.printf("%d %d %d\n", cards[i], cards[j], cards[k]);
						}
					} // 3
				} // ���ǹ�
			} // 2
		} // 1
		
	}
}


public class 백트래킹_01_순열1 {
	
	public static void main(String[] args) {
		
		int[] cards = { 3, 4, 5 };
		int N = cards.length;

		// 순열을 반복문을 이용해서 만들어보자~~
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i != j) {
					for (int k = 0; k < N; k++) {
						if (k != i && k != j) {
							System.out.printf("%d %d %d\n", cards[i], cards[j], cards[k]);
						}
					} // 3
				} // 조건문
			} // 2
		} // 1
		
	}
}

import java.util.Arrays;

public class 부분집합_02 {
	public static String[] 재료 = {"오이","우엉","햄","참치"};
	
	
	public static void main(String[] args) {
		int N = 4;
		int[] sel = new int [N];
		
		//i는 모든 부분집합이다.
		for(int i=0; i<(1<<N); i++) {
			System.out.println(i);
			//재료 검사를 하자.
			
			//비트 왼쪽으로 옮긴 횟수
			for(int j=0; j<N; j++) {
				if((i & (1<<j)) > 0) {
					System.out.print(재료[j]);
				}
				System.out.print(" 김밥");
			}
			
		}
	}
	
}

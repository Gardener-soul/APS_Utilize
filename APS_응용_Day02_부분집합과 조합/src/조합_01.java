import java.util.Arrays;

public class 조합_01 {
	public static String[] 토핑 = {"상추", "패티", "토마토","치즈","새우"};
	public static int N = 5;
	public static int R = 2; //문제에서 판단할 수 있는 부분들
	public static String[] sel = new String[R]; //내가 선택한 토핑
	
	public static void main(String[] args) {
		
		combination(0,0);
		
	}
	
	//idx : 실제 토핑의 idx , sidx는 sel의 index
	public static void combination(int idx, int sidx) {
		//기저파트
		if(sidx == R) {
			System.out.println(Arrays.toString(sel));
			return;
		}

		//어차피 sidx에서 우리가 필요한 2개의 조합들이 다 걸러진다.
		// 우리가 필요한 2개의 조합 (sidx를 먼저 위에 놔두어야한다.)
		if(idx==N) return; 
		
		//재귀파트
		sel[sidx] = 토핑[idx];  		//해당 재료 넣어보자.
		combination(idx+1, sidx+1); //idx번째 재료 뽑은거
		
//		sel[sidx] = null; //안뽑을래
		combination(idx+1, sidx); // idx번째 재료 안 뽑은거 ,, 그럼 만약에 3개 뽑으면,,, 

	}
	
}

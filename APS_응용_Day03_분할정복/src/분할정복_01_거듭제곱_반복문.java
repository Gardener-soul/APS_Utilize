
public class 분할정복_01_거듭제곱_반복문 {
	
	static int C;
	static int N;
	
	public static void main(String[] args) {
		
		C = 2;
		N = 10;
		
		System.out.println(Cgob(2,10));
		
	}
	
	//거듭제곱을 구하는 반복문을 이용한 메서드를 만들어보자.
	
	//Factorial을 구했던 것처럼 재귀함수를 이용해서도 구해보자.
	
	static int Cgob(int C, int N) {
		
		if(N==0) {
			return 1;
		}
		
		return C*Cgob(C,N-1);
		
	}
	
}

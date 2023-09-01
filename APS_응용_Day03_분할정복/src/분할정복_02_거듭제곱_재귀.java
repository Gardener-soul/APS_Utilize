
public class 분할정복_02_거듭제곱_재귀 {
	
	static int C;
	static int N;
	
	public static void main(String[] args) {
		
		C = 2;
		N = 10;
		
		System.out.println(pow(C,N));
		pow(C,N);
		
	}
	
	public static int pow(int C, int N) {
		
		//기저조건
		if(N==1) return C;
		
		//재귀조건
		return C*pow(C, N-1);
		
		//메모이제이션  : 연산 결과를 배열에 저장하는 것. 이미 그 값이 배열에 저장되어있으면 배열의 값을 리턴한다.
		
		//짝수일 때
//		if(N%2==0) {
//			return pow(C,N/2) * pow(C,N/2);
//		}
//		else { //홀수 일 때
//			return pow(C,(N-1)/2) * pow(C,(N-1)/2) * C;
//		}
		
	}
	
//	public static int pow2(int C, int N) {
//		//위의 식은 사실 너무 비효율적이다.
//		//똑같은 연산을 또 하지 않도록  코드를 수정해보자.
//		
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

import java.util.Scanner;

public class 그래프_01_인접행렬 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//정점의 개수(V)와 간선(E)의 수가 주어진다.
					// 간선의 수 : 두개의 정점 (시작, 끝 정점)
		// ex)정점의 개수 : 6 일때 0 base, 1 base일때의 따라 0~~5 , 1~~6으로 설정.
		
		int V = scanner.nextInt(); // 정점의 개수
		int E = scanner.nextInt(); // 간선의 개수
		
		int[][] adjArr = new int [V+1][V+1]; // 1번 ~ V개의 정점 번호를 이용한다라고 가정.
		
		//간선의 정보를 입력받자.
		for(int i=0; i<E; i++) {
			
			int A = scanner.nextInt(); // 시작 정점
			int B = scanner.nextInt(); // 끝 정점
			int w = scanner.nextInt(); // 가중치 그래프라고 했을 때 가중치 값
		
			adjArr[A][B] = 1; // 이렇게 저장하면 끝? 가중치가 있다면 w, 아니라면 1
			adjArr[B][A] = 1; // 무향이라면 필쑤 (유향이라면 생략)
			
			adjArr[A][B] = adjArr[B][A] = 1; // 이런식으로 한 방에 쓸 수도 있다. 
			
		}
		
	}
	
}

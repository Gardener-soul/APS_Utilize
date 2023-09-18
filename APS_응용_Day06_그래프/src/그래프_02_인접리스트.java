import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 그래프_02_인접리스트 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int V = scanner.nextInt(); // 정점의 개수
		int E = scanner.nextInt(); // 간선의 개수
		
		//인접리스트 (이거 어레이리스트는 그 배열의 크기를 지정하지 않아줘도 되는데 왜 크기를 설정함?)
		List<Integer>[] adjList = new ArrayList[V+1];
		
		for(int i=0; i<V+1; i++) {
			adjList[i] = new ArrayList<>(); // 0 으로 초기화를 해주어야함.
		}
		
		//간선의 정보를 입력받자.
		for(int i=0; i<E; i++) {
			
			int A = scanner.nextInt(); // 시작 정점
			int B = scanner.nextInt(); // 끝 정점
			int w = scanner.nextInt(); // 가중치 그래프라고 했을 때 가중치 값
			
			adjList[A].add(B); // 유향 그래프라면 24번 필요 없음.
			adjList[B].add(A); // 무향 그래프라면 필수
		}
		
	}
}

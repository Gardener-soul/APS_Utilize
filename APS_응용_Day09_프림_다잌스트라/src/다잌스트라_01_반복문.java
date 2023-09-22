import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 다잌스트라_01_반복문 {

	static class Node{
		
		int v,w;
		
		public Node (int v, int w) {
			this.v = v;
			this.w = w;
		}
		
	}
	
	static final int INF = Integer.MAX_VALUE;
	static int V,E; // V : 정점, E: 간선의 수
	static List<Node>[] adjList; //인접리스트
	static int[] dist; //최단 길이를 저장할 배열
	
	static void dijkstra(int start) {
		boolean[] visited = new boolean[V];
		
		dist[start] = 0; // 시작정점까지의 거리는 0으로 초기화
		
		for(int i=0; i<V-1; i++) {
			int min = INF;
			int idx = -1;
			
			//선택하지 않은 정점 중 dist가 가장 작은 값을 골라
			
			for(int j=0; j<V; j++) {
				if(!visited[j] && min >dist[j]) {
					min = dist[j];
					idx = j;
				}
			}
			
			if(idx == -1) break; // 선택할 수 있는 친구가 없다. (연결이 끊겨 있다.)
			
			visited[idx] = true; //선택.
			
			for(int j=0; j<adjList[idx].size(); j++) {
				Node curr = adjList[idx].get(j);
				
				//방문하지 않았고, 연결되어있으면서 (인접리스트라 확인하지 않아도 되긴 함)
				// 이미 가지고 있는 값보다 갱신할 여지가 있으면 갱신할거야.
				if(!visited[curr.v] && dist[curr.v] > dist[idx] + curr.w) {
					dist[curr.v] = dist[idx] + curr.w; 
				}
			}

		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(input);
		V = scanner.nextInt();
		E = scanner.nextInt();
		
		adjList = new ArrayList[V];
		for(int i=0; i<V; i++) {
			adjList[i] = new ArrayList<>();
		}
		
		dist = new int[V];
		Arrays.fill(dist,  INF);
		
		for(int i=0; i<E; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			int W = scanner.nextInt();
			
			//유향 그래프
			adjList[A].add(new Node(B,W)); //인접리스트에 노드 추가
		}
		
		
		dijkstra(0);
		
		System.out.println(Arrays.toString(dist));
		
	}
	
	static String input = "6 11\r\n" + "0 1 4\r\n" + "0 2 2\r\n" + "0 5 25\r\n" + "1 3 8\r\n" + "1 4 7\r\n"
			+ "2 1 1\r\n" + "2 4 4\r\n" + "3 0 3\r\n" + "3 5 6\r\n" + "4 3 5\r\n" + "4 5 12\r\n" + "";
	
}

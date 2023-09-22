import java.util.Arrays;
import java.util.Scanner;

public class 프림_01_반복문 {
	static final int INF = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(input);
		
		int V = sc.nextInt();
		int E = sc.nextInt();
		
		int[][] adjArr = new int[V][V];
		
		for(int i=0; i<E; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();	
			int W = sc.nextInt();
			
			adjArr[A][B] = W;
			adjArr[B][A] = W;
		}
		
		//정점은 뽑혔거나 안 뽑혔거나 두가지 상태 boolean[]
		boolean[] visited = new boolean[V];
		
		int[] p = new int[V]; //내가 어디에서 왔는지
		int[] dist = new int [V]; //key(값)을 저장하는 용도
		
		for(int i=0; i<V; i++) {
			p[i] = i;
			dist[i] = INF;
		}
		
//		Arrays.fill(dist, INF);
		
		//임의의 한 점을 선택해서 돌려야한다.
	
		dist[0] = 0; //이것이 가장 먼저 뽑히게 세팅
		
		int ans = 0; //프림 알고리즘 시작.
		
		for(int i=0; i<V-1; i++) {
			//1. 내가 가장 작은 값을 뽑겠다.
			int min = INF;
			int idx = -1;
			//반복문을 순회 하면서 아직 안 뽑은 친구들 중 가장 작은 값을 뽑겠다.
			for(int j=0; j<V; j++) {
				if(!visited[j]&&dist[j] < min) {
					min = dist[j];
					idx = j;
				}
			}
			//위의 반복문이 끝났다. 
			visited[idx] = true; //너는 뽑혔어.
			
			//2. 뽑은 친구와 인접한 친구들 중 갱신할 수 있는 애들은 모조리 갱신.
			for(int j=0; j<V; j++) {
				if(!visited[j] && adjArr[idx][j] != 0 && dist[j] > adjArr[idx][j]) {
					dist[j] = adjArr[idx][j];
					p[j] = idx; // 부모정보가 필요없다면 필요없어.
				}
			}
		}
		
		for(int i=0; i<V; i++) {
			ans += dist[i];
		}
		System.out.println(ans);
		
	} // main

	static String input = "7 11\r\n" + "0 1 32\r\n" + "0 2 31\r\n" + "0 5 60\r\n" + "0 6 51\r\n" + "1 2 21\r\n"
			+ "2 4 46\r\n" + "2 6 25\r\n" + "3 4 34\r\n" + "3 5 18\r\n" + "4 5 40\r\n" + "4 6 51\r\n" + "\r\n";
}

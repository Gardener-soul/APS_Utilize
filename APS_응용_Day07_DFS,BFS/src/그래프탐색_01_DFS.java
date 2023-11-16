
public class 그래프탐색_01_DFS {

	static int N = 7;
	//인접행렬 저장
	static int[][] adj = { 
			{ 0, 1, 1, 0, 0, 1, 0 }, 
			{ 1, 0, 0, 1, 0, 0, 1 }, 
			{ 1, 0, 0, 1, 0, 0, 0 },
			{ 0, 1, 1, 0, 0, 0, 1 },
			{ 0, 0, 0, 0, 0, 1, 1 },
			{ 1, 0, 0, 0, 1, 0, 0 }, 
			{ 0, 1, 0, 1, 1, 0, 0 } };
	
	//방문처리를 할 배열 필요.
	static boolean[] visited = new boolean[N];
	
	public static void main(String[] args) {
		
		DFS(0);
		
	}
	
	static void DFS(int v) { // v는 내가 현재 방문하고 있는 점.
		//v에 대한 방문 처리를 하겠다.
		visited[v] = true;
		System.out.println(v+1); //교재랑 맞추기 위해 출력만 +1 한 것!!
		
		//방문하지 않았으면서, 너와 내가 연결된 간선이 존재한다면 재귀를 호출.
		for(int i=0; i<N; i++) {
			
			// i는 나와 현재 연결되어 있는지.
			if(!visited[i] && adj[v][i] == 1) {
				DFS(i);
			}
			
		}
	}
	
}

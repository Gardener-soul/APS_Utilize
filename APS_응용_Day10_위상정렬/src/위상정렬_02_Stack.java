import java.util.Scanner;
import java.util.Stack;

public class 위상정렬_02_Stack {
	public static String[] cook = { "", "재료구매", "양념장만들기", "고기재우기", "고기손질", "제육볶음만들기", "식사", "뒷정리", "채소손질", "밥하기" };
	
	static int V,E;
	static int[][] arr;
	static int[] degree;
	static boolean[] chk;
	static Stack<Integer> stack;
	
	public static void DFS(int v) {
		
		chk[v] = true; // 현재 정점 방문 체크
		
		for(int i=1; i<=V; i++) {
			// 인접하지만 방문하지 않은 정점들을 방문하겠다.
			if(arr[v][i]==1 && !chk[i]) {
				DFS(i);
			}
			
		}
		
		stack.add(v);
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(input);
		V = scanner.nextInt();
		E = scanner.nextInt();
		
		//인접 행렬
		arr = new int[V+1][V+1]; // 문제에서 1번 정점부터 시작 V번까지
		degree = new int[V+1]; // 진입차수를 저장할 배열을 하나 생성
		chk = new boolean[V+1];
		stack = new Stack<>();
		
		for(int i=0; i<E; i++) {
			
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			
			// 유향이니까 A에서 B로만 저장한다.
			arr[A][B] = 1; // 가중치가 따로 주어지지 않았음
			
			// 진입차수를 증가
			degree[B] ++; 
			
		}
		
		// 진입차수가 0인 원소들을 가지고 출발.
		for(int i=1; i<V+1; i++) {
			if(degree[i] == 0) {
				DFS(i);
			}
		}
		
		while(!stack.isEmpty()) {
			System.out.println(cook[stack.pop()]);
		}
		
	}
	
	public static String input = "9 9\r\n" + "1 4\r\n" + "1 8\r\n" + "2 3\r\n" + "4 3\r\n" + "8 5\r\n" + "3 5\r\n"
			+ "5 6\r\n" + "9 6\r\n" + "6 7\r\n" + "";
}

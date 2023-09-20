import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 크루스칼_01 {
	
	static String input = "7 11\r\n" + "0 1 32\r\n" + "0 2 31\r\n" + "0 5 60\r\n" + "0 6 51\r\n" + "1 2 21\r\n"
			+ "2 4 46\r\n" + "2 6 25\r\n" + "3 4 34\r\n" + "3 5 18\r\n" + "4 5 40\r\n" + "4 6 51\r\n" + "\r\n";
	
	static int[] p; //대표를 저장할 배열
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(input);
		
		int V = scanner.nextInt(); //정점의 개수 0부터 시작한다.
		int E = scanner.nextInt(); // 간선의 수
		
		// 간선 배열을 만들어서 저장을 할건데 (2차원 배열을 가지고 하거나 사용자 정의 클래스 사용해서 가능)
		// 2차원 배열을 이용 ([0] : 시작 정점, [1] : 끝 정점. [2] : 가중치)
		
		int[][] edges = new int[E][3];
		
		for(int i=0; i<E; i++) {
			edges[i][0] = scanner.nextInt();
			edges[i][1] = scanner.nextInt();
			edges[i][2] = scanner.nextInt();
		} // 입력 끝
		
		//크루스칼 1단계 : 간선을 오름차순으로 정렬한다.
		Arrays.sort(edges, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[2] - o2[2];
			}
			
		});
		
		//크루스칼 2단계 : V-1개의 간선을 뽑아야 하는데, 사이클이 발생안하도록 뽑느다.
		p= new int[V];
		//2-1.make set 하자
		for(int i=0; i<V; i++ ) {
//			makeset(i);
			p[i] = i;
		}
		
		// 2-2. 검사하면서 뽑아
		int ans = 0; // 최소비용을 저장할 변수
		int pick = 0; // 뽑은 간선의 수를 저장할 친구
		
		// while 을 쓰겠다라고 하면 edges 배열을 돌릴 index 변수가 하나 필요하다.
		// for 문을 이용해서 쓰면 if문을 통해 break를 걸어줘야함.
		
		for(int i=0; i<E; i++) {
			//i번째 간선을 이용하여 두개의 정점을 가지고 처리하겠다.
			
			int x = edges[i][0];
			int y = edges[i][1];
			
			int px = findset(edges[i][0]);
			int py = findset(edges[i][1]);
			
//			if(findset(x) != findset(y)) {
				// 여기에 들어왔다는 뜻은 사이클이 형성이 안된다라는 뜻
			if(px != py) {
				
//				union(x, y);
				union(px,py);
				ans += edges[i][2];
				pick++;
				
			}
			
			if(pick == V-1) break; // V-1 개의 간선을 뽑아야 하니까 pick과 같아지면 반복문 종료
			
		}
		
		System.out.println(ans);
		System.out.println(Arrays.toString(p));
	}

	static void makeset(int i) {
		p[i] = i;
		//rank는 따로 하지 않는다.
	}
	
	static int findset(int x) {
		//비효율적인 방법
//		if(x == p[x]) return x;
//		return findset(p[x]);
	
		// 패스 컴프레션
		if(x!=p[x])
			p[x] = findset(p[x]);
		return p[x];
		
	}
	
	static void union(int x, int y) {
		
//		p[findset(y)] = findset(x); // x의 대표를 y의 대표로 넣겠다. rank 고려 X
		
		p[y] = x; // 허나 이렇게 작성하는 것은 문제를 잘 이해했고 확신이 있을 때.
		
	}

}

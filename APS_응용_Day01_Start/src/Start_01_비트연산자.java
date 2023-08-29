
public class Start_01_비트연산자 {

	public static void main(String[] args) {
		
		// & 두 비트가 1이면 1을 내뱉고, 아니면 0을 내뱉어
		// &의 활용 : 해당 비트가 있나요?
		System.out.println(3 & 5);
		
		// | 하나의 비트라도 1이면 1을 내뱉고 아니면 0을 내뱉어
		// |의 활용 : 해당 비트 썼어요!
		System.out.println(3 | 5);
		
		// ^ : XOR 같으면 0, 다르면 1
		System.out.println(3^5);
		
		// ~ : 단항 연산자로써 피연산자의 모든 비트를 반전시킨다.
		System.out.println(~4);
		
		// A << B : A의 비트를 왼쪽으로 B번 움직이겠다.
		// 한 번 움직일 때마다 2배씩 커진다.
		System.out.println(3 << 2);
		
		// A >> B : A의 비트를 오른쪽으로 B번 움직이겠다.
		// 한 번 움직일 때마다 2배씩 작아진다.
		System.out.println(12>>2);
		System.out.println(13>>1); // 소수점은 버린.
		
		//32번이 다시 초기화되는 기점.
		System.out.println(3 << 32);
	}
	
}

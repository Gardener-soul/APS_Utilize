
public class 분할정복_03_이진검색_반복 {

	public static int[] arr;
	public static int key;	
	
	
	//Delta같은 것들 선언할 때 이런 것들은 클래스 변수로 선언 ㅇㅇ
	
	public static void main(String[] args) {
		arr=new int[] {2,4,7,9,11,19,23};
		key = 7;
		
		System.out.println(binarySearch(0, arr.length-1));
		
	}
		
	public static boolean binarySearch(int st, int ed) {
		// 범위 안에 들어왔다면 해
		// 범위 안에 들어오지 않았다면 쳐내!! (이것으로 결정!!)
		
		if(st > ed) return false; //교차가 되어버렸다면, 찾고자 하는걸 찾지 못했음.
		
		int mid = (st + ed) / 2;
		
		if(arr[mid] == key) return true;
		else if (arr[mid] > key ) return binarySearch(st, mid-1); //왼쪽 구간으로
		else return binarySearch(mid+1, ed); //오른쪽 구간으로,,
		
	}
}


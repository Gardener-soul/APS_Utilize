
public class ��������_03_�����˻�_�ݺ� {

	public static int[] arr;
	public static int key;	
	
	
	//Delta���� �͵� ������ �� �̷� �͵��� Ŭ���� ������ ���� ����
	
	public static void main(String[] args) {
		arr=new int[] {2,4,7,9,11,19,23};
		key = 7;
		
		System.out.println(binarySearch(0, arr.length-1));
		
	}
		
	public static boolean binarySearch(int st, int ed) {
		// ���� �ȿ� ���Դٸ� ��
		// ���� �ȿ� ������ �ʾҴٸ� �ĳ�!! (�̰����� ����!!)
		
		if(st > ed) return false; //������ �Ǿ���ȴٸ�, ã���� �ϴ°� ã�� ������.
		
		int mid = (st + ed) / 2;
		
		if(arr[mid] == key) return true;
		else if (arr[mid] > key ) return binarySearch(st, mid-1); //���� ��������
		else return binarySearch(mid+1, ed); //������ ��������,,
		
	}
}


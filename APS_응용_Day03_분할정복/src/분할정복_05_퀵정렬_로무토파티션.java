
public class ��������_05_������_�ι�����Ƽ�� {


	   public static void quickSort(int[] input) {
	        quickSortRecur(input, 0, input.length - 1);
	    }

	    //�ι���Lomuto ���ҹ��� �̿��� quick sort ����
	    public static void quickSortRecur(int[] input, int left, int right) {

	        //quick sort ������ ������ ����
	        //right >= left�� �ϸ� ������������ ���ĵ�(9,8,7)
	        //���� ��������(7,8,9)
	        if (left >= right) {
	            return;
	        }

	        // pivot�� �߽����� ������ ū�� ������, pivot ������ ��ȯ
	        int pivotPos = partition(input, left, right);

	        //�������� ���ҵ� ����Ʈ
	        quickSortRecur(input, left, pivotPos - 1);
	        //���������� ���ҵ� ����Ʈ
	        quickSortRecur(input, pivotPos + 1, right);

	    }

	    public static void swap(int[] input, int a, int b) {
	        int temp = input[a];
	        input[a] = input[b];
	        input[b] = temp;

	    }

	    public static int partition(int[] input, int left, int right) {
	        int pivot = input[right];

	        int i = (left - 1);
	        for (int j = left; j < right; ++j) {
	            if (input[j] < pivot) {
	                ++i;
	                swap(input, i, j);
	            }
	        }
	        swap(input, (i + 1), right);
	        return i + 1;
	    }
	
}

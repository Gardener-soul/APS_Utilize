
public class ��������_06_������_ȣ����Ƽ�� {

//	{1,24,3,5,5,5,2,2,2,1,2,4}
	 public static void quickSort(int[] input) {
	        quickSortRecur(input, 0, input.length - 1);
	    }

	    //ȣ��Hoare ���ҹ��� �̿��� quick sort ����
	    public static void quickSortRecur(int[] input, int left, int right) {

	        //quick sort ������ ������ ����
	        if (left >= right) {
	            return;
	        }

	        // pivot�� �߽����� ������ ū�� ������, pivot ������ ��ȯ
	        int pivotPos = partition(input, left, right);


	        //�������� ���ҵ� ����Ʈ
	        quickSortRecur(input, left, pivotPos);
	        //���������� ���ҵ� ����Ʈ
	        quickSortRecur(input, pivotPos + 1, right);

	    }

	    public static void swap(int[] input, int a, int b) {
	        if (a != b) {
	            int temp = input[a];
	            input[a] = input[b];
	            input[b] = temp;
	        }

	    }

	    public static int partition(int[] input, int left, int right) {
	        int pivot = input[left];
	        int i = left - 1;
	        int j = right + 1;

	        while (true) {
	            do {
	                ++i;
	            } while (input[i] < pivot);

	            do {
	                --j;
	            } while (input[j] > pivot);

	            if (i >= j) {
	                return j;
	            }

	            swap(input, i, j);
	        }
	    }
}

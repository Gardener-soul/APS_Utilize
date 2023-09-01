
public class 분할정복_06_퀵정렬_호어파티션 {

//	{1,24,3,5,5,5,2,2,2,1,2,4}
	 public static void quickSort(int[] input) {
	        quickSortRecur(input, 0, input.length - 1);
	    }

	    //호어Hoare 분할법을 이용한 quick sort 구현
	    public static void quickSortRecur(int[] input, int left, int right) {

	        //quick sort 마지막 나가는 조건
	        if (left >= right) {
	            return;
	        }

	        // pivot을 중심으로 작은수 큰수 정렬후, pivot 포지션 반환
	        int pivotPos = partition(input, left, right);


	        //왼족으로 분할된 리스트
	        quickSortRecur(input, left, pivotPos);
	        //오른족으로 분할된 리스트
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


public class 분할정복_05_퀵정렬_로무토파티션 {


	   public static void quickSort(int[] input) {
	        quickSortRecur(input, 0, input.length - 1);
	    }

	    //로무토Lomuto 분할법을 이용한 quick sort 구현
	    public static void quickSortRecur(int[] input, int left, int right) {

	        //quick sort 마지막 나가는 조건
	        //right >= left로 하면 내림차순으로 정렬됨(9,8,7)
	        //현재 오름차순(7,8,9)
	        if (left >= right) {
	            return;
	        }

	        // pivot을 중심으로 작은수 큰수 정렬후, pivot 포지션 반환
	        int pivotPos = partition(input, left, right);

	        //왼족으로 분할된 리스트
	        quickSortRecur(input, left, pivotPos - 1);
	        //오른족으로 분할된 리스트
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

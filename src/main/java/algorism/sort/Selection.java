package algorism.sort;

import java.util.Arrays;


/**
 * 선택 정렬
 */
public class Selection {
	public static void main(String[] args) {
		int tmp, minIndex;
		int[] arr = {3, 5, 9, 2, 6, 8, 7, 1, 4};
		
		for (int i = 0; i < arr.length - 1; i++) {
			minIndex = i;
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			tmp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = tmp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}

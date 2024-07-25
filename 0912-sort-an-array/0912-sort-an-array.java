class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    
	private static void merge (int[] a, int left, int middle, int right) {
				
		int[] leftArray = new int[middle - left + 1];
		for (int i = 0; i < leftArray.length; i++) {
			leftArray[i] = a[left + i];
		}
		
		int[] rightArray = new int[right - middle];
		for (int j = 0; j < rightArray.length; j++) {
			rightArray[j] = a[middle + 1 + j];
		}
		
		int i = 0;
		int j = 0;
		int k = left;
		
		while (i < leftArray.length && j < rightArray.length) {	
			if (leftArray[i] <= rightArray[j]) {
				a[k] = leftArray[i];
				i++;				
			}
			else {
				a[k] = rightArray[j];
				j++;		
			}	
			k++;
		}
        
		while (i < leftArray.length) {
			a[k] = leftArray[i];
			k++;
			i++;
		}
			
		while (j < rightArray.length) {
			a[k] = rightArray[j];
			k++;
			j++;	
		}		
	}
	
	public static void mergeSort(int[] a, int l, int r) {
		if (l < r) {	
			int m = (l + r)/2;
			mergeSort(a, l, m);
			mergeSort(a, m + 1, r);
			merge(a, l, m, r);
		}
	}
}
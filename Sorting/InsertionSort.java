package PT;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int key = arr[i];
			int j;
			for(j=i-1;j>=0;j--) {
				if(key<arr[j]) {
					arr[j+1]=arr[j];
				}
			}
			arr[j+1]=key;
		}
		
		
	}
	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		insertionSort(arr);
		for(int i : arr) {
		    System.out.print(i + " ");
		}
	}
		
}



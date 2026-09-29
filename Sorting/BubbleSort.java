package PT;

public class BubbleSort {

	public static void bubblesort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-j;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}		
	}
	public static void main(String[] args) {
		int[] arr = {9,5,6,4};
		bubblesort(arr);
		for (int i : arr) {
            System.out.print(i + " ");
        }
	}

}

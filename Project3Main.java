// Author: Tytus Felbor

public class Project3Main {

	public static void reverseBubbleSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			
			for (int j = 0; j < n - i - 1; j++) {
				
				if (arr[j] < arr[j + 1]) {
					
					// Swap elements if they are in the wrong order
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int k = 0; k < 5; k ++) {
			
			int[] arr = new int[10000];
			int sameInteger = (int) (Math.random() * 1000000);
			for (int i = 0; i < arr.length; i++) {
				
				arr[i] = sameInteger;
			}

			long begin = System.currentTimeMillis();
			//ManySorts.insertion(arr);
			//ManySorts.bubble(arr);
			//ManySorts.selection(arr);
			//ManySorts.merge(arr);
			//ManySorts.quick(arr);
			ManySorts.stooge(arr);
			long end = System.currentTimeMillis();
			System.out.printf("Sort complete: %d, %d, %d, ...\n", arr[0], arr[1], arr[2]);
			System.out.printf("Run time: %fs", (end-begin)/1000.0);

			if (k != 4) {
				System.out.println();
			}
		}
	}

}

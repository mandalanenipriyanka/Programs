package Programs;

public class OccurenceofArray {
	

		 public static int findOcurance(int arr[] ,int n) {

		 int count=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]==n) {
		count++;

		 }
		}
		return count;
		}

		 public static void main(String[] args) {
		int arr[]= {1,2,3,4,3,2,1,6};
		System.out.println(findOcurance(arr,1));
		}

		}
	


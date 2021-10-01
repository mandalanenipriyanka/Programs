package Programs;
public class Sort {
public static int[] sortArray(int[]a)
		{
		int n = a.length;
		int temp;

		for(int j=0;j<n-1;j++)
		{
		if(a[j]>a[j+1])
		{
		temp = a[j+1];
		a[j+1] = a[j];
		a[j]= temp;
		}
		}
		return a;

		}
		 public static void main(String[] args) {
		int a[]=  {3,2,6,7,9};
		int b[] = sortArray(a);
		for(int i=0;i<b.length;i++)
		{
		System.out.println(b[i]);
		}
		}

		}




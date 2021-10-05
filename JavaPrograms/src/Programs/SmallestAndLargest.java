package Programs;

public class SmallestAndLargest {
	public static void main(String[] args) {
		int large,small,i;
		int a[] = {4,5,6,7,8};
		int n = a.length;
		large = small = a[0];
		for(i=1;i<n;i++)
		{
		if(a[i]>large)
		large = a[i];

		if(a[i]<small)
		small = a[i];

		}
		System.out.println("small value "+small);
		System.out.println("large value "+large);
		}

}

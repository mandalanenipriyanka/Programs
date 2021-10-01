package Programs;

public class reversearray {
	

		public static void main(String[] args) {
		int a[] = {4,5,6,7,8};

		System.out.println("original array is");
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);

		}
		System.out.println("reverse arrray is");
		for(int i = a.length-1;i>=0;--i)
		{
		System.out.println(a[i]);
		}

		}

		}



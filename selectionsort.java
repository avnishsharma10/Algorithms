//Java program for selectionSort
import java.util.*;

class SelectionSort
{
	void selectionSort(int arr[])
	{
		int n = arr.length;
		GfG obj = new GfG();
		for(int i=n-1; i>=0; i--)
		{
			int j = obj.select(arr, i);
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}	
	}
	
	void printArray(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		SelectionSort ss = new SelectionSort();
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			//GfG obj = new GfG();
			ss.selectionSort(arr);
			
			ss.printArray(arr);
			t--;
		}
		
	}
}
// } Driver Code Ends


/* The task is to complete select() which is used 
   as shown below to implement selectionSort() */

/* A function to implement selection sort
class SelectionSort
{
	void selectionSort(int arr[])
	{
		int n = arr.length;
		GfG obj = new GfG();
		for(int i=n-1; i>=0; i--)
		{
			int j = obj.select(arr, i);
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}	
	}
} */
class GfG
{
    int  select(int arr[], int i)
    {
        int maxidx=i;
	for(int j=i-1;j>=0;j--)
	{
	    if(arr[j]>arr[maxidx])
	    {
	        maxidx=j;
	    }
	}
	return maxidx;
    }
}
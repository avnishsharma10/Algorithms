// binary search algorithm for a sorted array 
import java.util.*;
import java.lang.*;
import java.io.*;

class gfg
{
    
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String s[] = read.readLine().trim().split("\\s+");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            
            int arr[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            for(int i = 0; i < n; i++)
            {
                arr[i] = Integer.parseInt(st[i]);
            }
            
            SearchElement obj = new SearchElement();
            
            System.out.println(obj.searchInSorted(arr, n, k));
        }
    }
}

class SearchElement{
    static int searchInSorted(int arr[], int n, int k)
    {
        int low=0, high=n-1;
        int mid;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==k) return 1;
            else if(k<arr[mid])
            {
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return -1;        
    }
}
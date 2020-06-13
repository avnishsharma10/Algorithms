import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            new Election().winner(arr, n);
            
            System.out.println();
        }
    }
}// } Driver Code Ends
//User function Template for Java

class Election
{
    static void winner(String arr[], int n)
    {
        // add your code
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        for(int i=0;i<n;i++){
            if(!hm.containsKey(arr[i]))
            hm.put(arr[i],1);
            else
            hm.put(arr[i],hm.get(arr[i])+1);
        }
        int max=0;
        String ans="";
        for(Map.Entry<String,Integer> me:hm.entrySet()){
            String key=me.getKey();
            Integer val=me.getValue();
            if(val>max){
                max=val;
                ans=key;
            }
            if(val==max&&ans.compareTo(key)>0){
                max=val;
                ans=key;
            }
        }
        System.out.print(ans+" "+max);
    }
}


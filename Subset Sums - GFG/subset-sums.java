// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}
// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
       ArrayList<Integer> res = new ArrayList<>();
       find_ans(0, 0, res, arr, N);
       Collections.sort(res);
       return res;
    }
    
    void find_ans(int i, int sum, ArrayList<Integer> res, ArrayList<Integer> arr, int N){
        if(N == i){res.add(sum); return;}
        
        find_ans(i + 1, sum + arr.get(i), res, arr, N);
        find_ans(i + 1, sum, res, arr, N);
    }
}
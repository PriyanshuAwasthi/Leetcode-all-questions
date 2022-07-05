// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans = new ArrayList<>();
        int arr[][] = new int[n][n];
        for(int []temp : arr) Arrays.fill(temp, 0);
        if(m[0][0] == 1) helper(0, 0, m, n, ans, "", arr);
        return ans;
    }
    
    public static void helper(int i, int j, int [][]m, int n, ArrayList<String> ans, String temp, int [][]arr){
        if(i == n - 1 && j == n - 1){
            ans.add(temp);
            return;
        }
        //down
        if(i + 1 < n && m[i + 1][j] != 0 && arr[i + 1][j] != 1){
            arr[i][j] = 1;
            helper(i + 1, j, m, n, ans, temp+"D", arr);
            arr[i][j] = 0;
        }
        
        //left
        if(j - 1 >= 0 && m[i][j - 1] != 0 && arr[i][j - 1] != 1){
            arr[i][j] = 1;
            helper(i, j - 1, m, n, ans, temp+"L", arr);
            arr[i][j] = 0;
        }
        
        //right
        if(j + 1 < n && m[i][j + 1] != 0 && arr[i][j + 1] != 1){
            arr[i][j] = 1;
            helper(i, j + 1, m, n, ans, temp+"R", arr);
            arr[i][j] = 0;
        }
        
        //up
        if(i - 1 >= 0 && m[i - 1][j] != 0 && arr[i - 1][j] != 1){
            arr[i][j] = 1;
            helper(i - 1, j, m, n, ans, temp+"U", arr);
            arr[i][j] = 0;
        }
    }
}
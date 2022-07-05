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
        int i_offset[] = new int[]{1, 0, 0, -1};
        int j_offset[] = new int[]{0, -1, 1, 0};
        if(m[0][0] == 1) helper(0, 0, m, n, ans, "", arr, i_offset, j_offset);
        return ans;
    }
    
    public static void helper(int i, int j, int [][]m, int n, ArrayList<String> ans, String temp, int [][]arr, int []i_offset, int []j_offset){
        if(i == n - 1 && j == n - 1){
            ans.add(temp);
            return;
        }
        
        String tp = "DLRU";
        for(int a = 0; a < 4; a++){
            int index_i = i + i_offset[a];
            int index_j = j + j_offset[a];
            
            if(index_i >= 0 && index_i < n && index_j < n && index_j >= 0 && arr[index_i][index_j] != 1 && m[index_i][index_j] != 0){
                arr[i][j] = 1;
                helper(index_i, index_j, m, n, ans, temp + tp.charAt(a), arr, i_offset, j_offset);
                arr[i][j] = 0;
            }
        }
    }
}
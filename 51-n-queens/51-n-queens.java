class Solution {
    
    private List<List<String>> solutions;
    
    public List<List<String>> solveNQueens(int n) {
        
        solutions = new ArrayList<>();
        List<String> list = new ArrayList<>();
        
        fun(
            new boolean[n], 
            new boolean[2 * n - 1],
            new boolean[2 * n - 1], 
            0, 
            list
        );
        
        return solutions;
    }
    
    private void fun(
        boolean[] v, 
        boolean[] d1, 
        boolean[] d2, 
        int i, 
        List<String> list
    ) {
        if(i == v.length) {
            solutions.add(new ArrayList<>(list));
            return;
        };
        
        for(int j = 0; j < v.length; j++) {
            
            if(v[j] == true) continue;
            if(d1[v.length - i - 1 + j] == true) continue;
            if(d2[i + j] == true) continue;
            
            char[] row = new char[v.length];
            Arrays.fill(row,'.');
            row[j] = 'Q';
            
            v[j] = true;
            d1[v.length - i - 1 + j] = true;
            d2[i + j] = true;
            list.add(new String(row));
            
            fun(v, d1, d2, i + 1, list);
            
            v[j] = false;
            d1[v.length - i - 1 + j] = false;
            d2[i + j] = false;
            list.remove(list.size() - 1);
        }   
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj=new ArrayList<>();
        
        for(int i=0;i<=n;i++)
            adj.add(new ArrayList<>());
        
        for(int[] t:times)
            adj.get(t[0]).add(new int[]{t[1],t[2]});
        
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(a[1]-b[1]));
        boolean[] vis=new boolean[n+1];   
        int visCount=0;
        
        pq.add(new int[]{k,0});
        
        while(!pq.isEmpty()){
            int[] curr=pq.remove();
            if(vis[curr[0]])
                continue;
            
            vis[curr[0]]=true;
            visCount++;
            
            if(visCount==n)
                return curr[1];
            
            for(int[] nei:adj.get(curr[0])){
                if(vis[nei[0]]) continue;
                
                pq.add(new int[]{nei[0],curr[1]+nei[1]});
            }
        }
        
        return -1;
    }
}
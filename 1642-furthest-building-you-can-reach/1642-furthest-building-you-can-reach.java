class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        // priority queue to store used brick, priotized by their usage;
        // more usage comes first, needs to be used later when no bricks left...
        PriorityQueue<Integer> jumps = new PriorityQueue<>(Collections.reverseOrder());
        
        // jump length that reuires, to reach to next building from current one...
        int jumpLength = 0;
        for(int i=0; i<heights.length-1; i++) {
            jumpLength = heights[i+1]-heights[i];
            if(jumpLength <= 0) {
                // direct, went to next building...
                continue;
            } else {
                // perform jump...
                bricks -= jumpLength;
                jumps.add(jumpLength);
                if(bricks < 0) {
                    bricks += jumps.poll();
                    if(ladders > 0) {
                        ladders -= 1;
                    } else {
                        return i;
                    }  
                }
            }
        }
        return heights.length - 1;
    }
}
class Solution {
public List<List<Integer>> getSkyline(int[][] buildings) {
        int[][] buildingPoints = new int[buildings.length * 2][2];
        // Split the original input with size 1x3 into two vectors of size 1x2: 
		// e.g. [2,9,10] -> [2,-10] and [9,10], -10 shows that 2 is the start
        int i = 0;
        for (int[] building : buildings) {
            // Negative height for the start
            buildingPoints[i][0] = building[0];
            buildingPoints[i][1] = -building[2];
            // Positive height for the end
            buildingPoints[i + 1][0] = building[1];
            buildingPoints[i + 1][1] = building[2];
            i += 2;
        }
        // Sort from smallest to largest based on first column elements 
        Arrays.sort(buildingPoints, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
				// If the first elments are identical, based on the second elements
                return o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[1]; 
            }
        });

        List<List<Integer>> res = new ArrayList<>();

        TreeMap<Integer, Integer> queue = new TreeMap<>();  // Default ascending order
        // Since the height of the building is likely to be repeated,  let the key record the height, and the value record the number of times the same height appears
        queue.put(0, 1);
        int prevMaxHeight = 0;

        for (int j = 0; j < buildingPoints.length; j++) {
            int[] buildingPoint = buildingPoints[j];
            if (buildingPoint[1] < 0) {  // isStart == true;
                queue.compute(-buildingPoint[1], (key, value) -> {
                    if (value != null) {
                        return value + 1;
                    }
                    return 1;
                });
				//  or: queue.put(-buildingPoint[1], queue.getOrDefault(-buildingPoint[1], 0) + 1);
            } else {  // isStart == false;
                queue.compute(buildingPoint[1], (key, value) -> {
                    if (value == 1) {
                        return null;
                    }
                    return value - 1;
                });
            }

            int currMaxHeight = queue.lastKey(); // Since queue is in ascending order by default
            // if height changes from previous height then this building x becomes critical x.
            // So add it to the result.
            if (currMaxHeight != prevMaxHeight) {
                res.add(Arrays.asList(buildingPoint[0], currMaxHeight));
                prevMaxHeight = currMaxHeight;
            }
        }
        return res;
    }
}
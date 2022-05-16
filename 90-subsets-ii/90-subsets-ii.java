class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        find_subset(0, new ArrayList<>(), res, nums);
        Set<List> set1 = new HashSet<List>();
        for(int i = 0; i < res.size(); i++){
            set1.add(res.get(i));
        }
        List<List<Integer>> finl = new ArrayList<List<Integer>>();
        Iterator<List> itt = set1.iterator();
        while(itt.hasNext()){
            finl.add(itt.next());
        }
        return finl;
    }
    
    private void find_subset(int i, List<Integer> res2, List<List<Integer>> res, int[] nums){
        if(i == nums.length){
            res.add(new ArrayList<>(res2));
            return;
        }
        
        find_subset(i + 1, res2, res, nums);
        res2.add(nums[i]);

        find_subset(i + 1, res2, res, nums);
        res2.remove(res2.size() - 1);

    }
}
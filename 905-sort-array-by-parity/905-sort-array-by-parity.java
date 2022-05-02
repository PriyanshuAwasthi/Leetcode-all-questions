class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> count = new ArrayList<Integer>();
        int n = nums.length;
        int i = 0;
        int a = 0;
        while(i < n){
            if(nums[i] % 2 == 0){
                nums[a] = nums[i];
                a++;
                i++;
            }
            else{
                count.add(nums[i]);
                i++;
            }
        }
        
        Iterator<Integer> iter = count.iterator();
        while(iter.hasNext()){
            nums[a] = iter.next();
            a++;
        }
        
        return nums;
    }
}
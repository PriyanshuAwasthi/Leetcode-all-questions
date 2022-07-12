class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int flag = 0;
        for(int i = 0; i < nums1.length; i++){
            flag = 0;
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    flag = 1;
                }
                if(flag == 1){
                    if(nums1[i] < nums2[j]){
                        nums1[i] = nums2[j];
                        break;
                    }
                    else if(nums2.length-1 == j){
                        nums1[i] = -1;
                        break;
                    }
                }
            }
        }
        return nums1;
    }
}
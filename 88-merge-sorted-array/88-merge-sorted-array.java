class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        if(n != 0){
            for(int i = 0; i < m; i++){
                Arrays.sort(nums2);
                if(nums1[i] > nums2[j]){
                    int temp = nums1[i];
                    nums1[i] = nums2[j];
                    nums2[j] = temp;
                    continue;
                } 
            }
            Arrays.sort(nums2);
            for(int i = m; i < m + n; i++){
                nums1[i] = nums2[j];
                j++;
            }   
        }
    }
}
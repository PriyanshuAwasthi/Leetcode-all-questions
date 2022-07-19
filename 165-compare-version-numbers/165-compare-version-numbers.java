class Solution {
    public int compareVersion(String version1, String version2) {
        int i = 0; 
        int j = 0; 
        String arr1[] = version1.split("\\.");
        String arr2[] = version2.split("\\.");
        while(i < arr1.length && j < arr2.length){
            int v1 = Integer.parseInt(arr1[i++]);
            int v2 = Integer.parseInt(arr2[j++]);
            if(v1 > v2) return 1;
            else if(v2 > v1) return -1;
        }
        while(i < arr1.length){
            int v1 = Integer.parseInt(arr1[i++]);
            if(v1 > 0) return 1;
        }
        while(j < arr2.length){
            int v2 = Integer.parseInt(arr2[j++]);
            if(v2 > 0) return -1;
        }
        return 0;
    }
}

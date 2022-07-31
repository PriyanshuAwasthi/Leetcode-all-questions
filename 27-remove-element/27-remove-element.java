class Solution {
    public int removeElement(int[]a, int val) {
        int c=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]==val)
                continue;
            else{
                a[c]=a[i];
                c++;
            }
        }
       return c; 
    }
}
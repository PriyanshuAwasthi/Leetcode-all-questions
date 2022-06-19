class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> ans = new ArrayList<>();
        Arrays.sort(products);
        int l=0,r=products.length-1;
        String start="";
        for(int i=0;i<searchWord.length();i++)
        {
            start += searchWord.charAt(i);
            while(l<=r && l<products.length && !products[l].startsWith(start))
                l++;
            while(r>0 && r>=l && !products[r].startsWith(start))
                r--;
            List<String> suggest = new ArrayList<>();
            for(int j=0;j<3;j++)
            {
                if(((l+j) >= products.length) || (l+j) > r)
                    break;
                suggest.add(products[l+j]);
            }
            ans.add(suggest);
        }
        return ans;
    }
}
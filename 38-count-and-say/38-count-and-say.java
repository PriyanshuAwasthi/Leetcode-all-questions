class Solution {
    Map<Integer,String> dp=new HashMap<>();
    
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        if(dp.containsKey(n))
            return dp.get(n);
        String ret = countAndSay(n-1);
        char prev=0;int count=0;
        String ans= new String();
        for(int i=0;i<ret.length();i++)
        {
            if(prev!=0)
            {
                if(prev!=ret.charAt(i))
                {
                    ans += Integer.toString(count) + prev;
                    count=0;
                }
            }
            count++;
            prev=ret.charAt(i);
        }
        ans += Integer.toString(count) + prev;
        dp.put(n,ans);
        return ans;
    }
}
class Solution {
    long[][] memo;
    int mod = 1000000007;
    public int countVowelPermutation(int n) {
        memo = new long[n][26];
        for(long[] ar : memo) Arrays.fill(ar,-1);
        long ans=0;
        ans=(ans+dp(n-1,'a')%mod)%mod;
    
        ans=(ans+dp(n-1,'e')%mod)%mod;
    
        ans=(ans+dp(n-1,'i')%mod)%mod;
    
        ans=(ans+dp(n-1,'o')%mod)%mod;
    
        ans=(ans+dp(n-1,'u')%mod)%mod;
        return (int)ans%mod;
    }
    
    public long dp(int n, char last){
        if(n==0) return 1;
        if(memo[n][last-'a']!=-1) return memo[n][last-'a'];
        
        long c=0;
        
        if(last=='a'){
            c+=dp(n-1,'e')%mod;
        }
        else if(last=='e'){
            c+=dp(n-1,'a')%mod;
            c+=dp(n-1,'i')%mod;
        }
        else if(last=='i'){
            c+=dp(n-1,'a')%mod;
            c+=dp(n-1,'e')%mod;
            c+=dp(n-1,'o')%mod;
            c+=dp(n-1,'u')%mod;
        }
        else if(last=='o'){
            c+=dp(n-1,'u')%mod;
            c+=dp(n-1,'i')%mod;
        }
        else {
            c+=dp(n-1,'a')%mod;
        }
        memo[n][last-'a']=c%mod;
        return c%mod;
    }
}
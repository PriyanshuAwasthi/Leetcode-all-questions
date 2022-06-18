class WordFilter {
    HashMap<String,Integer> mp;
    public WordFilter(String[] words) {
        mp=new HashMap<String,Integer>();
        int i,j,k,len=words.length,l;
        for(i=0;i<len;i++){
            String w=words[i];
            l=w.length();
            for(j=0;j<=l;j++){
                for(k=0;k<=l;k++){
                    mp.put(w.substring(k)+"#"+w.substring(0,j),i);
                }
            }
        }
    }
    
    public int f(String prefix, String suffix) {
        return mp.getOrDefault(suffix+"#"+prefix,-1);
    }
}
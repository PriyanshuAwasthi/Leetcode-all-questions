class TimeMap {
    public String DEF = "";
    public HashMap<String, TreeMap<Integer, String>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> temp;
        if(map.containsKey(key)){
            temp = map.get(key);
        }
        else{
            temp = new TreeMap<>();
            map.put(key, temp);
        }
        temp.put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if(map.containsKey(key)){
            TreeMap<Integer, String> mp = map.get(key);
            Integer ans = mp.floorKey(timestamp);
            if(ans != null) return mp.get(ans);
        }
        return DEF;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
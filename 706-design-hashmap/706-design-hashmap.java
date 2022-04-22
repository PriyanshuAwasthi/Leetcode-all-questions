class MyHashMap {
    private int []res = new int[10000001];
    
    public MyHashMap() {
        Arrays.fill(res, -1);
    }
    
    public void put(int key, int value) {
        res[key] = value;
    }
    
    public int get(int key) {
        return res[key];
    }
    
    public void remove(int key) {
        res[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
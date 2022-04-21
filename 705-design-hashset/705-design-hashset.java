class MyHashSet {
    Map<Integer, Integer> ref = new HashMap<Integer, Integer>();
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        ref.put(key, 1);
    }
    
    public void remove(int key) {
        if(ref.containsKey(key)) ref.remove(key);
        else return;
    }
    
    public boolean contains(int key) {
        return ref.containsKey(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
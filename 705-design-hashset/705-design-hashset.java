class MyHashSet {
    private boolean temp[];
    public MyHashSet() {
        temp = new boolean[10000001];
        Arrays.fill(temp, false);
    }
    
    public void add(int key) {
        temp[key] = true;
    }
    
    public void remove(int key) {
        if(temp[key] == true) temp[key] = false;
    }
    
    public boolean contains(int key) {
        return temp[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
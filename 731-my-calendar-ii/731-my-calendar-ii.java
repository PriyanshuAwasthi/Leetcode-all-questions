class MyCalendarTwo {
    TreeMap<Integer, Integer> res;
    public MyCalendarTwo() {
        res = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        res.put(start, res.getOrDefault(start, 0) + 1);
        res.put(end, res.getOrDefault(end, 0) - 1);
        int count = 0;
        for(Map.Entry<Integer, Integer> temp : res.entrySet()){
            count += temp.getValue();
            if(count >= 3){
                res.put(start, res.getOrDefault(start, 0) - 1);
                res.put(end, res.getOrDefault(end, 0) + 1);
                return false;
            } 
            if(temp.getKey() == end) break;
        } 
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */
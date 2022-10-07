class MyCalendarThree {
    private TreeMap<Integer, Integer> lines;   
    public MyCalendarThree() {
        lines = new TreeMap<>();
    }
    
    public int book(int start, int end) {
        lines.put(start, lines.getOrDefault(start, 0) + 1); 
        lines.put(end, lines.getOrDefault(end, 0) - 1);
        int mx = 0, cnt = 0;
        for (int x : lines.values()) {
            cnt += x;
            mx = Math.max(mx, cnt);
        }
        return mx;
    }
    
}

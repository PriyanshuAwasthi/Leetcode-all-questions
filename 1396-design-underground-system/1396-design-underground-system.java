class UndergroundSystem {
    
    class MyClass{
        String name;
        int time;
        
        public MyClass(String name, int time){
            this.name = name;
            this.time = time;
        }
    }
    
    HashMap<Integer,MyClass> map;
    HashMap<String,int[]> avgMap;
    
    public UndergroundSystem() {
        map = new HashMap<>();
        avgMap = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        map.put(id,new MyClass(stationName,t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        
        MyClass curr = map.get(id);
        
        String str = curr.name+" "+stationName;
        int time = t-curr.time;
        
        map.remove(id);
        
        if(avgMap.containsKey(str)){
            int[] arr = avgMap.get(str);
            arr[0] += time;
            arr[1]++;    
        }
        
        else{
            int[] arr = new int[2];
            arr[0] = time;
            arr[1] = 1;
            avgMap.put(str,arr);
        }
        
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String temp = startStation+" "+endStation;
        int[] arr = avgMap.get(temp);
        return (double)arr[0]/(double)arr[1];
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
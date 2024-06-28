class Solution {
    public long maximumImportance(int n, int[][] roads) {  
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < roads.length; i++){
            map.put(roads[i][0], map.getOrDefault(roads[i][0], 0) + 1);
            map.put(roads[i][1], map.getOrDefault(roads[i][1], 0) + 1);
        }
        
        ArrayList<Integer> list = new ArrayList<>(map.keySet()); 
        list.sort((a, b) -> map.get(b) - map.get(a));

        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int i = 0; i < list.size(); i++){
            map1.put(list.get(i), n);
            n--;
        }
        
        long totalImportance = 0;
        for(int i = 0; i < roads.length; i++){
            totalImportance += map1.get(roads[i][0]) + map1.get(roads[i][1]);
        }
        
        return totalImportance;
    }
}
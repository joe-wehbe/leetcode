class Solution {
    public int minimumPushes(String word) {
        
        HashMap<Character, Integer> map = new HashMap<>();
         
        for(int i = 0; i < word.length(); i++){
            map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) + 1);   
        }
        
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        
        int pushes = 0;
        int pushTimes = 1;
        int index = 0;
        
        for (Map.Entry<Character, Integer> entry : list) {
            pushes += pushTimes * entry.getValue();
            index++;
            if(index % 8 == 0){
                pushTimes++;
            }
        }
        
        return pushes;
    }
}
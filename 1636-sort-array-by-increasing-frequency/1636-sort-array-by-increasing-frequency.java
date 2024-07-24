class Solution {
    public static int[] frequencySort(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((entry1, entry2) -> {
            if (entry1.getValue().compareTo(entry2.getValue()) == 0) {
                return entry2.getKey().compareTo(entry1.getKey()); 
            } else {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });
        
        int i = 0;
        int[] result = new int[nums.length];
        for (Map.Entry<Integer, Integer> entry : list) {
            int frequency = entry.getValue();
            while(frequency > 0){
                result[i] = entry.getKey();
                frequency--;
                i++;
            }
        }

        return result;
    }
}
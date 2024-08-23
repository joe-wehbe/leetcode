class Solution {
    public int[] separateDigits(int[] nums) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int num : nums){
            if(num < 10){
                list.add(num);
            }   
            else{
                String str = Integer.toString(num);
                for(int j = 0; j < str.length(); j++){
                    list.add(Integer.parseInt(Character.toString(str.charAt(j))));
                }
            }
        }
        
        int index = 0;
        int[] result = new int[list.size()];
        for(int num : list){
            result[index] = num;
            index++;
        }
        
        return result;
    }
}
class Solution {
    public int countElements(int[] nums) {
        
        if(nums.length < 3){
            return 0;
        }
        
        Arrays.sort(nums);
        
        int first = 0;
        while(first < nums.length && nums[first] == nums[0]) {
            first++;
        }
    
        int last = nums.length - 1;
        while(last >= 0 && nums[last] == nums[nums.length - 1]) {
            last--;
        }
        
        System.out.println(first);
        System.out.println(last);
       
        
        int count = 0;
        for(int i = first; i <= last; i++) {
            count++;   
        }
        
        return count;
    }
}
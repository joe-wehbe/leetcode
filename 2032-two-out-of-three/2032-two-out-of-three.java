class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<Integer>();
        
        List<Integer> lnums1 = new ArrayList<Integer>();
        for(int num : nums1) {
            lnums1.add(num);
            set.add(num);
        }
        
        List<Integer> lnums2 = new ArrayList<Integer>();
        for(int num: nums2) {
            lnums2.add(num);
            set.add(num);            
        }
        
        List<Integer> lnums3 = new ArrayList<Integer>();
        for(int num: nums3) {
            lnums3.add(num);
            set.add(num);       
        }
        
        for(int num : set){
            if((lnums1.contains(num) && lnums2.contains(num)) || 
               (lnums1.contains(num) && lnums3.contains(num)) ||
               (lnums2.contains(num) && lnums3.contains(num))){
                list.add(num);
            }
        }
        return list;
    }
}
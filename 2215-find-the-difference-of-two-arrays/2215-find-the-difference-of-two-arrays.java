class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());       
        
        List<Integer> lnums1 = new ArrayList<>();
        for(int num : nums1){
            lnums1.add(num);
        }
        
        List<Integer> lnums2 = new ArrayList<>();
        for(int num : nums2){
            lnums2.add(num);
        }
        
        for(int num : nums1){
            if(!lnums2.contains(num) && !list.get(0).contains(num)){
                list.get(0).add(num);     
            }
        }
        
        for(int num : nums2){
            if(!lnums1.contains(num) && !list.get(1).contains(num)){
                list.get(1).add(num);
            }
        }
        return list;
    }
}
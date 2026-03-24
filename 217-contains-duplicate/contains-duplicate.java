class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for(int n : nums){
            map.add(n);
        }        
        if(map.size() == nums.length){
            return false;
        }
        return true;
    }
}
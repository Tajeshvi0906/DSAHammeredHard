class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0;i < nums.length; i++){
            int c= target - nums[i];
            if(map.containsKey(c)){
                return new int[]{ map.get(c), i };
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No Two sum solution");
    }

    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = twoSum(nums, target);
       System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
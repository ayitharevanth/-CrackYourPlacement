class Solution {
    public int[] twoSum(int[] nums, int target) {   
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            int y = target - nums[i];
            if(map.containsKey(y)){
                return new int[] {i, map.get(y) };
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}

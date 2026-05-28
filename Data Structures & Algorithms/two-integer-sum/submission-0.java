class Solution {
    public int[] twoSum(int[] nums, int target) {
        int diff = 0;
        int[] answer = new int[2];
        Map<Integer,Integer> difLookup = new HashMap<>();

        difLookup.put(nums[0],0);
        
        for (int i = 1; i < nums.length; i++) {

            diff = target - nums[i];

            if (difLookup.containsKey(diff)) {
                answer[0] = difLookup.get(diff);
                answer[1] = i;
            }

            difLookup.put(nums[i],i);
        }
        return answer;
    }
}

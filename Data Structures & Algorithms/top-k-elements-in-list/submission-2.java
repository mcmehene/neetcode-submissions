class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // Create a map of frequency
        Map<Integer,Integer> freq = new HashMap<>();
        List<Integer>[] buckets = new List[nums.length + 1];

        // Hashmap of numbers and their frequencies
        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i],freq.getOrDefault(nums[i],0) + 1);
        }

        // Create nested array with inner lists keeping numbers 
        // per frequency
        for (int j = 0; j < buckets.length; j++) {
            buckets[j] = new ArrayList<>();
        }

        // Add in the numbers to their frequency bucket
        for (Map.Entry<Integer,Integer> entry : freq.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey());
        }

        // Get the k most frequent numbers
        int[] ans = new int[k];
        int count = 0;
        for (int n = buckets.length - 1; n > 0 && count < k; n--) {
            
            for (int num : buckets[n]) {

                ans[count++] = num;
                if (count == k) {
                    return ans;
                }
            }
        }
        return ans;

    }
}

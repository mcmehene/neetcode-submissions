class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prods = new int[nums.length];
        int fullProd = 1;
        int zeroCnt = 0;

        for (int n : nums) {
            if (n != 0) {
                fullProd *= n;
            } else {
                zeroCnt++;
            }
        }

        if (zeroCnt > 1) {
            return new int[nums.length];
        }
        for (int i = 0; i < nums.length; i++) {
            if (zeroCnt > 0) {
                prods[i] = (nums[i] == 0) ? fullProd : 0;
            } else {
                prods[i] = fullProd / nums[i];
            }
        }

        return prods;
    }
}  

package code;

import java.util.HashMap;
import java.util.Map;

class Solution {
	 public int countNicePairs(int[] nums) {
	        int[] rev = new int[nums.length];
	        for (int i = 0; i < nums.length; i++) {
	            rev[i] = reverse(nums[i]);
	        }

	        Map<Integer, Integer> map = new HashMap<>();
	        for (int i = 0; i < nums.length; i++) {
	            int diff = nums[i] - rev[i]; 
	            map.put(diff, map.getOrDefault(diff, 0) +
	            		1);
	        }

	        int mod = (int) (1e9 + 7);
	        long op = 0;
	        for (int val : map.values()) {
	            op += ((long) val * (long) (val - 1) / 2);
	            op %= mod;
	        }

	        return (int) (op % mod);
	    }

    public int reverse(int num){
        int rem=0,reverse=0;
        while(num!=0){
            rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;

        }
        return reverse;
    }
}
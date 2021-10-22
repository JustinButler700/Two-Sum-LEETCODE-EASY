//Justin Butler 10/22/2021
/*
55 / 55 test cases passed.
Runtime: 1 ms
Memory Usage: 38.9 MB
Beats 99% of Java Submissions.
*/
class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(hm.containsKey(target-nums[i]))
            {
                return(new int[]{hm.get(target-nums[i]),i});
            }
            else
            {
                hm.put(nums[i], i);
            }
        }
        return(new int[]{0,0});
    }
}

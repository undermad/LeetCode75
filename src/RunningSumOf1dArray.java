public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {

        //https://leetcode.com/problems/running-sum-of-1d-array/?envType=study-plan&id=level-1

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }
}

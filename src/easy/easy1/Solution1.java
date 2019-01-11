package easy.easy1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by teds on 12/18/2018.
 */
public class Solution1 {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int rest;
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0;i < nums.length; i++) {
            rest = target - nums[i];
            if(numMap.containsKey(rest)) {
                result[0] = numMap.get(rest);
                result[1] = i;
                return result;
            }
            numMap.put(nums[i], i);

        }
        return null;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numbers, target);
        for(int n : result) {
            System.out.println(n + " ,");
        }
    }
}

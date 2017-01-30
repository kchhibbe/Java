/**
 * Created by Kanishk on 1/30/17.
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 *You may assume that each input would have exactly one solution.
 *
 *Example:
 *Given nums = [2, 7, 11, 15], target = 9,
 *
 *Because nums[0] + nums[1] = 2 + 7 = 9,
 *return [0, 1].
 *
 */

import java.util.*;

public class TwoSum
{
    public static void main(String[] args)
    {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = new int[2];
        result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);

    }

    public static int[] twoSum(int[] nums, int target)
    {
        Hashtable hash = new Hashtable();

        int[] answer = new int[2];

        for(int i=0; i<nums.length; i++)
        {
            if(hash.containsKey(nums[i]))
            {
                //return answer
                answer[0] = (int)hash.get(nums[i]);
                answer[1] = i;
            }
            else
            {
                hash.put(target - nums[i], i);
            }
        }

        return answer;
    }
}

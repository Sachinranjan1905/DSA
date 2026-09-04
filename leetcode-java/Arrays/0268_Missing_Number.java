/*
 * Missing Number
 * --------------
 * Given an array containing n distinct numbers from the range [0, n],
 * find the only number that is missing.
 *
 * Approach:
 * - Use the XOR (^) bitwise operator to find the missing number.
 * - XOR all indices from 0 to n and all elements of the array.
 * - Every number that appears twice cancels out because x ^ x = 0.
 * - The only number left after cancellation is the missing number.
 *
 * Example:
 * nums = [3, 0, 1]
 *
 * Expected numbers: 0, 1, 2, 3
 * Array numbers:    3, 0, 1
 *
 * After XOR cancellation:
 * 0 ^ 1 ^ 2 ^ 3 ^ 3 ^ 0 ^ 1 = 2
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class 0268_Missing_Number {
    public int missingNumber(int[] nums) {
        /*Set<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int found=0;
        for(int i=0;i<=nums.length;i++){
            if(!set.contains(i)){
              found= i;
              break;
            }
        }
        return found;
        */
            int found = nums.length;

        for (int i = 0; i < nums.length; i++) {
            found ^= i;
            found ^= nums[i];
        }

        return found;
    }
}

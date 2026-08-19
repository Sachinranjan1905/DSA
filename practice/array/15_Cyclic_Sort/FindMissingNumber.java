/** Find the missing value from an array containing distinct values in [0,n]. */
public class FindMissingNumber {
    public static int find(int[] values) {
        int answer = values.length;
        for (int index = 0; index < values.length; index++) answer ^= index ^ values[index];
        return answer;
    }
}

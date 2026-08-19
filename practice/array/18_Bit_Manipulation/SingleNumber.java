/** Find the one value that appears once while every other value appears twice. */
public class SingleNumber {
    public static int find(int[] values) {
        int answer = 0;
        for (int value : values) answer ^= value;
        return answer;
    }
}

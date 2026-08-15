import java.util.HashMap;
import java.util.Map;
public class FrequencyOfElements {
    public static void Frequency(int[] arr){
        Map<Integer,Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        System.out.println(freqMap);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4,5};
        Frequency(arr);
    }
}

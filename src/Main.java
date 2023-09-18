import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] list = {6, 4, 7, 45, 6, 98, 3, 98, 46, 2, 7, 5, 5, 3, 45};

        // A map to store the counts of used numbers
        Map<Integer, Integer> numberCount = getIntegerIntegerMap(list);

        // Print the results
        System.out.println("Repeating even numbers:");
        for (Map.Entry<Integer, Integer> entry : numberCount.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            if (count > 1) {
                System.out.println(num + " repeats " + count + " times.");
            }
        }
    }

    private static Map<Integer, Integer> getIntegerIntegerMap(int[] list) {
        Map<Integer, Integer> numberCount = new HashMap<>();

        // Iterate through the array to calculate the number counts
        for (int num : list) {
            if (num % 2 == 0) {
                if (!numberCount.containsKey(num)) {
                    numberCount.put(num, 1);
                } else {
                    int count = numberCount.get(num);
                    numberCount.put(num, count + 1);
                }
            }
        }
        return numberCount;
    }
}

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] frequencySort(int[] numbers) {
        
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : numbers) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
    
        List<Integer> sortedList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
         
        sortedList.sort((a, b) -> {
            int freqCompare = Integer.compare(freqMap.get(a), freqMap.get(b));
            if (freqCompare != 0) {
                return freqCompare;
            } else {
                return Integer.compare(b, a); 
            }
        });

        return sortedList.stream().mapToInt(i -> i).toArray();
    }
}
import java.util.*;
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        int index = 0;
        for (int num : arr2) {
            int freq = countMap.get(num);
            for (int i = 0; i < freq; i++) {
                arr1[index++] = num;
            }
            countMap.remove(num); 
        }
        List<Integer> remaining = new ArrayList<>(countMap.keySet());
        Collections.sort(remaining);
        for (int num : remaining) {
            int freq = countMap.get(num);
            for (int i = 0; i < freq; i++) {
                arr1[index++] = num;
            }
        }
        return arr1;
    }
}

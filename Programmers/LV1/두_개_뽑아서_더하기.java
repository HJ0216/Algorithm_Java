import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        Set<Integer> tempSet = new TreeSet<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                tempSet.add(numbers[i] + numbers[j]);
            }
        }

        answer = Arrays.stream(tempSet.toArray(new Integer[0]))
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}

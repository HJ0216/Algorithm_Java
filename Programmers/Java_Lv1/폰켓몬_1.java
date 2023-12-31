import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        
        answer = set.size() <= nums.length/2 ? set.size() : nums.length/2;
        
        return answer;
    }
}

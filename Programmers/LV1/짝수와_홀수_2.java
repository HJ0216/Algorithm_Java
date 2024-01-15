class Solution {
    public String solution(int num) {
        String answer = "";
        
        answer = ((num % 2 == -1) || (num % 2 == 1)) ? "Odd" : "Even";
        
        return answer;
    }
}

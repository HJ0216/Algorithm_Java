class Solution {
    public String solution(int[] food) {
		String answer = "";
        StringBuffer sb = new StringBuffer();

        for (int i=1; i<food.length; i++) {
            for(int j=1; j<=(food[i]/2); j++){
                sb.append(i);
            }
        }

        answer = sb.toString() + "0" + sb.reverse().toString();

        return answer;

    }
}
import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
		int answer = 0;
        
		for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
        }

        int h = sizes[0][0];
        int w = sizes[0][1];

        for (int i = 1; i < sizes.length; i++) {
            h = h < sizes[i][0] ? sizes[i][0] : h;
            w = w < sizes[i][1] ? sizes[i][1] : w;
        }

        answer = h * w;

        return answer;

    }
}

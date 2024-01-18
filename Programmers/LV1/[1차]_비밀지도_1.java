class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        StringBuilder sb1 = new StringBuilder();
        for (int i : arr1) {
            sb1.append(String.format("%" + n + "s", Integer.toBinaryString(i)).replace(" ", "0"));
        }

        StringBuilder sb2 = new StringBuilder();
        for (int i : arr2) {
            sb2.append(String.format("%" + n + "s", Integer.toBinaryString(i)).replace(" ", "0"));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sb1.length(); i++) {
            if(sb1.charAt(i) == '1' || sb2.charAt(i) == '1'){
                sb.append("#");
            } else {
                sb.append(" ");
            }
        }

        answer = sb.toString().split("(?<=\\G.{" + n + "})");

        return answer;
    }
}

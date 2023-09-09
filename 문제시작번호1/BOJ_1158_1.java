package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(i + 1);
        }

        StringBuffer sb = new StringBuffer();

        int idx = 0;
        for (int i = 0; i < N; i++) {
            idx = idx + K - 1 > list.size() ? idx + K - 1 - list.size() : idx + K - 1;
            while (idx >= list.size()) {
                idx = idx - list.size();
            }
            sb.append(list.get(idx));
            if (i != (N - 1)) {
                sb.append(", ");
            }
            list.remove(idx);
        }

        bw.write("<" + sb + ">");

        bw.flush();
        bw.close();

    }

}

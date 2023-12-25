import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
 
        Queue<Integer> queue = new LinkedList<>();
 
        for (int i = 0; i < N; i++) {
            queue.add(i + 1);
        }
 
        StringBuilder sb = new StringBuilder("<");
 
        while (queue.size() > 1) {
            for (int i = 0; i < K - 1; i++) {
                queue.add(queue.poll());
            }
            sb.append(queue.poll() + ", ");
        }
 
        sb.append(queue.poll() + ">");
 
        bw.write(sb.toString());
 
        bw.flush();
        bw.close();
 
    }
 
}

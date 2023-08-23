import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] origin = new int[N];
		int[] sorted = new int[N];

		Map<Integer, Integer> map = new HashMap<>();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			int element = Integer.parseInt(st.nextToken());
			sorted[i] = element;
			origin[i] = element;
		}

		Arrays.sort(sorted);

		int rank = 0;
		for (int v : sorted) {
			if (!map.containsKey(v)) {
				map.put(v, rank);
				rank++;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int key : origin) {
			int ranking = map.get(key); // 원본 배열 원소(key)에 대한 value(순위)를 갖고온다.
			sb.append(ranking).append(" ");
		}

		bw.write(sb.toString());

		bw.flush();
		bw.close();

	}

}

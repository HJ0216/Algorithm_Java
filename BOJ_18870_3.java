import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] origin = new int[N];

		Map<Integer, Integer> map = new TreeMap<>();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			int element = Integer.parseInt(st.nextToken());
			origin[i] = element;
			map.put(element, 0);
		}

		int ranking = 0;
		for (int key : map.keySet()) {
			map.replace(key, ranking);
			ranking++;
		}

		StringBuilder sb = new StringBuilder();
		for (int key : origin) {
			sb.append(map.get(key)).append(" ");
		}

		bw.write(sb.toString());

		bw.flush();
		bw.close();

	}

}

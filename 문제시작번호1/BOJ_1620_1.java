import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());

		Map<String, Integer> map = new HashMap<>();
		List<String> list = new ArrayList<>();

		for (int i = 1; i <= N; i++) {
			String s = br.readLine();
			map.put(s, i);
			list.add(s);
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < M; i++) {
			String s = null;
			try {
				s = br.readLine();
				int num = Integer.valueOf(s);
				sb.append(list.get(num - 1)).append("\n");
			} catch (NumberFormatException nfe) {
				sb.append(map.get(s)).append("\n");
			}
		}

		bw.write(sb.toString());

		bw.flush();
		bw.close();

	}
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Map<String, Boolean> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			map.put(br.readLine(), false);
		}

		while (M-- > 0) {
			String s = br.readLine();
			if (map.containsKey(s)) {
				map.replace(s, true);
			}
		}

		Set<String> set = new TreeSet<>();

		for (String s : map.keySet()) {
			if (map.get(s)) {
				set.add(s);
			}
		}

		StringBuilder sb = new StringBuilder();
		
		sb.append(set.size()).append("\n");
		
		for (String s : set) {
			sb.append(s).append("\n");
		}

		bw.write(sb.toString());

		bw.flush();
		bw.close();
	}
}

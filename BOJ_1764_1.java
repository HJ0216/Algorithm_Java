import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
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
		Set<String> set = new HashSet<>();
		for (int i = 0; i < N; i++) {
			set.add(br.readLine());
		}
		int cnt = 0;
		Set<String> result = new TreeSet<>();
		while (M-- > 0) {
			String s = br.readLine();
			if (set.contains(s)) {
				cnt++;
				result.add(s);
			}
		}
		bw.write(cnt + "\n");
		for(String s : result) {
			bw.write(s+"\n");
		}
		bw.flush();
		bw.close();
	}
}

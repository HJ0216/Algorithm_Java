import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < N; i++) {
			set.add(Integer.valueOf(st.nextToken()));
		}

		st = new StringTokenizer(br.readLine());
		int cnt = 0;
		for (int i = 0; i < M; i++) {
			int num = Integer.valueOf(st.nextToken());
			cnt = set.contains(num) ? cnt + 1 : cnt;
			set.add(num);
		}

		bw.write((set.size() - cnt) + "");

		bw.flush();
		bw.close();

	}

}

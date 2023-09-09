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

		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Set<Integer> setN = new HashSet<>();
		Set<Integer> setM = new HashSet<>();

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			setN.add(Integer.parseInt(st.nextToken()));
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			setM.add(Integer.parseInt(st.nextToken()));
		}

		int cnt = 0;
		for (int i : setN) {
			cnt = !setM.contains(i) ? cnt + 1 : cnt;
		}
		for (int i : setM) {
			cnt = !setN.contains(i) ? cnt + 1 : cnt;
		}

		bw.write(cnt + "");

		bw.flush();
		bw.close();

	}

}

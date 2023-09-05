import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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

		Set<Integer> set1 = new TreeSet<>();
		StringTokenizer stN = new StringTokenizer(br.readLine());
		while (N-- > 0) {
			set1.add(Integer.parseInt(stN.nextToken()));
		}

		Set<Integer> set2 = new TreeSet<>();
		StringTokenizer stM = new StringTokenizer(br.readLine());
		while (M-- > 0) {
			set2.add(Integer.parseInt(stM.nextToken()));
		}

		int A = return_size(set1, set2);
		int B = return_size(set2, set1);

		bw.write((A + B) + "");

		bw.flush();
		bw.close();

	}

	public static int return_size(Set<Integer> set1, Set<Integer> set2) {
		int cnt = 0;
		for (int i : set2) {
			if (!set1.contains(i)) {
				cnt++;
			}

		}

		return cnt;
	}

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] iQueue = new int[N * 2];

		for (int i = 1; i <= N; i++) {
			iQueue[i] = i;
		}

		int idx_first = 1;
		int idx_last = N;
		while (N-- > 1) {
			idx_first++;
			idx_last++;
			iQueue[idx_last] = iQueue[idx_first];
			idx_first++;
		}

		bw.write(iQueue[idx_first] + "");

		bw.flush();
		bw.close();

	}
}

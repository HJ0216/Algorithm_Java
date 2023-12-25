import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.valueOf(st.nextToken());
		int[] arr = new int[N + 1];

		arr[0] = 0;

		if (N >= 1) {
			arr[1] = 1;

			for (int i = 2; i <= N; i++) {
				arr[i] = arr[i - 1] + arr[i - 2];
			}
		}

		bw.write(arr[N] + "");

		bw.flush();
		bw.close();

	}
}

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
		int K = Integer.valueOf(st.nextToken());

		int result = factorial(N) / (factorial(N - K) * factorial(K));

		bw.write(result + "");

		bw.flush();
		bw.close();

	}

	public static int factorial(int i) {
		if (i <= 1)
			return 1;

		return i * factorial(i - 1);
	}
}

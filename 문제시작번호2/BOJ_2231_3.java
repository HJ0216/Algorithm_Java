import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();
		int N = Integer.parseInt(s);

		int i = 0;
		for (i = N - s.length() * 9>=0 ? N - s.length() * 9 : 0; i < N; i++) {
			int num = i;
			int sum = 0;

			while (num != 0) {
				sum += num % 10;
				num /= 10;
			}

			if ((sum + i) == N) {
				bw.write(i + "");
				break;
			}
		}

		if (i == N) {
			bw.write("0");
		}
		bw.flush();
		bw.close();

	}

}

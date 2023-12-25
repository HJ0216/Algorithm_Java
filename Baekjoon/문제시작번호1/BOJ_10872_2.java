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

		bw.write(factorial(N) + "");

		bw.flush();
		bw.close();
	}

	public static int factorial(int N) {
		if (N <= 1)
			return 1;
		return N * factorial(N - 1);
	}

}

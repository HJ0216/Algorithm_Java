import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			sb.append(lcm(a, b)).append('\n');
		}

		br.close();

		bw.write(sb.toString());

		bw.flush();
		bw.close();

	}

	// 최대공약수 반복문 방식
	public static int gcd(int a, int b) {
		
		while(b!=0) {
			int r = a % b;
			a = b;
			b = r;
		}

		return a;
	}

	// 최소공배수 : Least Common Mulitiple
	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}

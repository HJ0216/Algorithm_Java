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

		int N = Integer.valueOf(br.readLine());

		StringBuilder reverse = new StringBuilder();

		while (N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			while (st.hasMoreTokens()) {
				StringBuilder origin = new StringBuilder();
				origin.append(st.nextToken());
				reverse.append(origin.reverse()).append(" ");
			}
			reverse.append("\n");
		}

		bw.write(reverse.toString());

		bw.flush();
		bw.close();
	}

}

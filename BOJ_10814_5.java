import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		StringBuilder[] sbArr = new StringBuilder[201];
		
		for(int i = 0; i < sbArr.length; i++) {
			sbArr[i] = new StringBuilder();
		}

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();

			sbArr[age].append(age + " " + name + "\n");
		}

		StringBuilder sb = new StringBuilder();

		for (StringBuilder stringBuilder : sbArr) {
			sb.append(stringBuilder);
		}

		bw.write(sb + "");

		bw.flush();
		bw.close();
	}

}

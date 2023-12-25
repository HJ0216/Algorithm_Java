import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = Integer.parseInt(br.readLine());

		StringBuffer sb = new StringBuffer();

		boolean[] bArr = new boolean[2000001];

		for (int i = 0; i < cnt; i++) {
			bArr[Integer.parseInt(br.readLine()) + 1000000] = true;
		}

		for (int i = 0; i < bArr.length; i++) {
			if (bArr[i]) {
				sb.append(i - 1000000).append("\n");
			}
		}

		bw.write(sb + "");

		bw.flush();
		bw.close();

	}

}

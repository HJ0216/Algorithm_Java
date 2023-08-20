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

		int[] iArr = new int[10001];

		for (int i = 0; i < cnt; i++) {
			iArr[Integer.parseInt(br.readLine())]++;
		}

		for (int i = 0; i < iArr.length; i++) {
			while (iArr[i]-- > 0) {
				sb.append(i).append("\n");
			}
		}

		bw.write(sb + "");

		bw.flush();
		bw.close();

	}

}

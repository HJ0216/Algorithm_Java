import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int kg = Integer.parseInt(br.readLine());

		int cnt = 0;
		while (true) {
			if (kg % 5 == 0) {
				bw.write(((kg / 5) + cnt) + "");
				break;
			} else if (kg < 0) {
				bw.write("-1");
				break;
			}
			kg -= 3;
			cnt++;
		}

		bw.flush();
		bw.close();

	}

}

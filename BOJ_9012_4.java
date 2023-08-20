import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			String s = br.readLine();

			int num = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(') {
					num++;
				} else {
					num--;
					if(num<0) break;
				}
				
			}

			if (num == 0) {
				bw.write("YES\n");
			} else {
				bw.write("NO\n");
			}
		}

		bw.flush();
		bw.close();

	}

}

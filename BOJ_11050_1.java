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
		int a = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());

		int top = 1;
		int btm = 1;
		
		int cnt = b;
		while(cnt-->0) {
			top *= a;
			a--;
			btm *= b;
			b--;
		}
		
		bw.write((top/btm)+"");

		bw.flush();
		bw.close();

	}
}

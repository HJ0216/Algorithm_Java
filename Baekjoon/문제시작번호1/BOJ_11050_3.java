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
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		bw.write(pascalsT(N, K) + "");
		bw.flush();
		bw.close();
	}
	public static int pascalsT(int N, int K) {
		if(N==K | K==0)
			return 1;
		
		return pascalsT(N-1, K-1) + pascalsT(N-1, K);
	}
}

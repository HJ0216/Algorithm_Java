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

		bw.write(fibonacci(N) + "");

		bw.flush();
		bw.close();

	}

	public static long fibonacci(int N) {
		if(N==0) return N;
		if(N==1) return N;
		
		return fibonacci(N-2) + fibonacci(N-1);
		
	}
}

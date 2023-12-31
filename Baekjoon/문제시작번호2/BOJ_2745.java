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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s = st.nextToken();
		int n = Integer.parseInt(st.nextToken());

		int sum=0;
		for(int i=0; i<s.length(); i++) {
			int a = (int) s.charAt(i);
			if(a>47 && a<58) {a = a-48;}
			else if(a>64 && a<91) {a = a-55;}
			
			sum += a*Math.pow(n, s.length()-1-i);
			
		}
		bw.write(sum + "");
		
		bw.flush();
		bw.close();
		
	}
	
}

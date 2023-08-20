import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;

		while((n = Integer.parseInt(br.readLine()))!=-1) {
			StringBuilder sb = new StringBuilder();
			sb.append(n + " = 1");
			
			int sum=1;
			for(int i=2; i<n; i++) {
				if(n%i==0) {
					sb.append(" + " + i);
					sum += i;
				}				
			}
			
			if(sum==n) {
				bw.write(sb + "\n");
			} else {
				bw.write(n + " is NOT perfect.\n");
			}
		}
		
		bw.flush();
		bw.close();
		
	}

}

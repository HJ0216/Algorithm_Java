import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		BigInteger n = new BigInteger(br.readLine());
		
		BigInteger result = n.multiply(n).multiply(n);
		
		bw.write(result + "\n" + 3);
		
		bw.flush();
		bw.close();
	}
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IndexOutOfBoundsException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<num; i++) {
			String s = br.readLine();
			bw.write(s.charAt(0));
			bw.write(s.charAt(s.length()-1) + "\n");
		}
		
		bw.flush();
		bw.close();
		
	}
}

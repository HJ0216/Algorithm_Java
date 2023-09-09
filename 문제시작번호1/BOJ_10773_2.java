import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		int[] intArr = new int[num];

		int top = -1;

		while (num-- > 0) {
			int i = Integer.parseInt(br.readLine());
			if (i != 0) {
				top++;
				intArr[top] = i;
			} else {
				top--;
			}
		}

		br.close();

		int sum = 0;
		for (int i = 0; i <= top; i++) {
			sum += intArr[i];
		}

		bw.write(sum + "");
		bw.flush();
		bw.close();
	}

}

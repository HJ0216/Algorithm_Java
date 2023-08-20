import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static boolean[] bArr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int min = Integer.parseInt(br.readLine());
		int max = Integer.parseInt(br.readLine());

		calPrimeNum(min, max);

		int sum = 0;
		int first = 0;
		for (int i = max; i >= min; i--) {
			if (!bArr[i]) {
				sum += i;
				first = i;
			}
		}

		if (first != 0) {
			bw.write(sum + "\n" + first);
		} else {
			bw.write("-1");
		}

		bw.flush();
		bw.close();

	}

	public static void calPrimeNum(int min, int max) throws IOException {
		bArr = new boolean[max + 1];

		bArr[0] = true;
		bArr[1] = true;

		for (int i = 2; i < Math.sqrt(max); i++) {
			if (bArr[i]) {
				continue;
			}

			for (int j = i * i; j < bArr.length; j += i) {
				bArr[j] = true;
			}
		}

	}

}

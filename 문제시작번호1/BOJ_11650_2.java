import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		int[][] intArrXY = new int[num][2];

		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			intArrXY[i][0] = a;
			intArrXY[i][1] = b;

		}

		Arrays.sort(intArrXY, (arr1, arr2) -> {
			if (arr1[0] == arr2[0]) {
				return arr1[1] - arr2[1];
			} else {
				return arr1[0] - arr2[0];
			}
		});

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < num; i++) {
			sb.append(intArrXY[i][0] + " " + intArrXY[i][1] + "\n");
		}

		bw.write(sb + "");
		bw.flush();
		bw.close();
	}

}

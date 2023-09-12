import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {

	static StringBuilder sb;

	static Map<Integer, String> mapIntStr;
	static Map<String, Integer> mapStrInt;

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] NM = br.readLine().split(" ");

		int N = Integer.valueOf(NM[0]);
		int M = Integer.valueOf(NM[1]);

		mapIntStr = new HashMap<>();
		mapStrInt = new HashMap<>();

		for (int i = 1; i <= N; i++) {
			String name = br.readLine();
			mapIntStr.put(i, name);
			mapStrInt.put(name, i);
		}

		sb = new StringBuilder();

		for (int i = 1; i <= M; i++) {
			String str = br.readLine();
			result(str);
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	public static void result(String str) {
		if (Character.isDigit(str.charAt(0))) {
			sb.append(mapIntStr.get(Integer.parseInt(str)) + "\n");
		} else {
			sb.append(mapStrInt.get(str) + "\n");
		}
	}

}

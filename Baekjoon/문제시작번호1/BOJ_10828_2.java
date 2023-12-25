import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int[] stack;
	static int location = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder sb = new StringBuilder();

		int N = Integer.valueOf(br.readLine());

		stack = new int[N];

		StringTokenizer st;

		while (N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");

			switch (st.nextToken()) {
			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				sb.append(pop()).append("\n");
				break;
			case "size":
				sb.append(size()).append("\n");
				break;
			case "empty":
				sb.append(empty()).append("\n");
				break;
			case "top":
				sb.append(top()).append("\n");
				break;
			}

		}

		bw.append(sb.toString());

		bw.flush();
		bw.close();
	}

	public static void push(int i) {
		stack[location] = i;
		location++;
	}

	public static int pop() {
		if (location == 0) {
			return -1;
		} else {
			int result = stack[location - 1];
			stack[location - 1] = 0;
			location--;
			return result;
		}
	}

	public static int size() {
		return location;
	}

	public static int empty() {
		return location == 0 ? 1 : 0;
	}

	public static int top() {
		return location == 0 ? -1 : stack[location - 1];
	}

}

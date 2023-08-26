import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = Integer.parseInt(br.readLine());

		Stack<String> stack = new Stack<>();

		StringBuffer sb = new StringBuffer();

		while (cnt-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			switch (st.nextToken()) {
			case "push":
				stack.push(st.nextToken());
				break;
			case "top":
				if (!stack.isEmpty()) {
					sb.append(stack.lastElement() + "\n");
				} else {
					sb.append("-1\n");
				}
				break;
			case "size":
				sb.append(stack.size() + "\n");
				break;
			case "empty":
				sb.append((stack.isEmpty() ? "1" : "0") + "\n");
				break;
			case "pop":
				if (!stack.isEmpty()) {
					sb.append(stack.lastElement() + "\n");
					stack.pop();
				} else {
					sb.append("-1\n");
				}
				break;
			}

		}

		bw.write(sb + "");

		bw.flush();
		bw.close();

	}

}

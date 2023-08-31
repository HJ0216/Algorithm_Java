import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = Integer.parseInt(br.readLine());

		ArrayDeque<Integer> queue = new ArrayDeque<>();

		StringBuilder sb = new StringBuilder();

		while (cnt-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			switch (st.nextToken()) {
			case "push":
				queue.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if (!queue.isEmpty()) {
					sb.append(queue.element() + "\n");
					queue.remove();
				} else {
					sb.append("-1\n");
				}
				break;
			case "size":
				sb.append(queue.size() + "\n");
				break;
			case "empty":
				sb.append((queue.isEmpty() ? "1" : "0") + "\n");
				break;
			case "front":
				if (!queue.isEmpty()) {
					sb.append(queue.peek() + "\n");
				} else {
					sb.append("-1\n");
				}
				break;
			case "back":
				if (!queue.isEmpty()) {
					sb.append(queue.peekLast() + "\n");
				} else {
					sb.append("-1\n");
				}
				break;
			}

		}

		bw.write(sb.toString());

		bw.flush();
		bw.close();

	}

}

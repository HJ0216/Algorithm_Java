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

		ArrayDeque<Integer> deque = new ArrayDeque<>();

		StringBuilder sb = new StringBuilder();

		while (cnt-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			switch (st.nextToken()) {
			case "1":
				deque.addFirst(Integer.parseInt(st.nextToken()));
				break;
			case "2":
				deque.addLast(Integer.parseInt(st.nextToken()));
				break;
			case "7":
				if (!deque.isEmpty()) {
					sb.append(deque.peekFirst() + "\n");
				} else {
					sb.append("-1\n");
				}
				break;
			case "8":
				if (!deque.isEmpty()) {
					sb.append(deque.peekLast() + "\n");
				} else {
					sb.append("-1\n");
				}
				break;
			case "3":
				if (!deque.isEmpty()) {
					sb.append(deque.peekFirst() + "\n");
					deque.removeFirst();
				} else {
					sb.append("-1\n");
				}
				break;
			case "4":
				if (!deque.isEmpty()) {
					sb.append(deque.peekLast() + "\n");
					deque.removeLast();
				} else {
					sb.append("-1\n");
				}
				break;
			case "5":
				sb.append(deque.size() + "\n");
				break;
			case "6":
				sb.append((deque.isEmpty() ? "1" : "0") + "\n");
				break;
			}

		}

		bw.write(sb.toString());

		bw.flush();
		bw.close();

	}

}

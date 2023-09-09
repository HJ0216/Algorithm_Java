import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int[] stack;
	static int pointer = 0;

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		stack = new int[N];

		StringTokenizer st;

		while (N-- > 0) {
			st = new StringTokenizer(br.readLine());

			switch (st.nextToken()) {
			case "1":
				push(Integer.parseInt(st.nextToken()));
				break;
			case "2":
				sb.append(pop()).append("\n");
				break;
			case "3":
				sb.append(size()).append("\n");
				break;
			case "4":
				sb.append(empty()).append("\n");
				break;
			case "5":
				sb.append(top()).append("\n");
				break;
			}

		}
		
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();

	}

	public static void push(int i) {
		stack[pointer] = i;
		pointer++;
	}

	public static int pop() {
		if (pointer == 0) {
			return -1;
		} else {
			int result = stack[pointer - 1];
			stack[pointer - 1] = 0;
			pointer--;
			return result;
		}
	}

	public static int size() {
		return pointer;
	}

	public static int empty() {
		return pointer == 0 ? 1 : 0;
	}

	public static int top() {
		return pointer == 0 ? -1 : stack[pointer - 1];
	}

}

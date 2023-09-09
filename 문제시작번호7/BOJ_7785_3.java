import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());

		Set<String> set = new HashSet<>();

		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			String name = input[0];
			String status = input[1];

			if (set.contains(name)) {
				set.remove(name);
			}
			if (status.equals("enter")) {
				set.add(name);
			}

		}

		List<String> list = new ArrayList<>();
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			list.add(it.next());
		}

		Collections.sort(list, Collections.reverseOrder());

		for (String name : list) {
			bw.write(name + "\n");
		}

		bw.flush();
		bw.close();
	}

}

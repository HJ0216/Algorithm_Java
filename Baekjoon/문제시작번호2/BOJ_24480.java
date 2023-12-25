import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static int[] visited;

	static List<ArrayList<Integer>> graph = new ArrayList<>(); // 정점들의 정보를 기록할 그래프

	static int count = 1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		visited = new int[N + 1];

		// graph의 index를 정점의 개수만큼 만들어줌
		for (int i = 0; i < N + 1; i++) {
			graph.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int fromN = Integer.parseInt(st.nextToken());
			int toN = Integer.parseInt(st.nextToken());

			// 무방향이기 때문에 양쪽으로 정보를 추가
			graph.get(fromN).add(toN);
			graph.get(toN).add(fromN);
		}

		// 내림차순 정렬
		Comparator<Integer> descComparator = Collections.reverseOrder();

		for (int i = 1; i < graph.size(); i++) {
			Collections.sort(graph.get(i), descComparator);
		}

		// 깊이 우선 탐색 재귀 시작
		dfs(R);

		StringBuilder sb = new StringBuilder();

		// 각 인덱스별로 방문 순서가 기록된 배열을 순회하며, 값을 StringBuilder에 저장
		for (int i = 1; i < visited.length; i++) {
			sb.append(visited[i]).append("\n");
		}

		bw.write(sb.toString());

		bw.flush();
		bw.close();
	}

	// 깊이 우선 탐색 메서드
	private static void dfs(int R) {
		visited[R] = count; // 현재 방문하고있는 정점에 순서 저장

		// 현재 위치한 정점이 갈 수 있는 정점 리스트를 순회
		for (int i = 0; i < graph.get(R).size(); i++) {
			int newN = graph.get(R).get(i);

			// 다음 갈 정점을 방문했었는지 체크(0일 경우 방문 X)
			if (visited[newN] == 0) {
				count++;
				dfs(newN);
			}
		}
	}

}

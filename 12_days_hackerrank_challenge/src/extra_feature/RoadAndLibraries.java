package extra_feature;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoadAndLibraries {
	private static List<Integer>[] adjZombie;
	private static boolean[] visited;
	private static int connectedComponents;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();

		adjZombie = new ArrayList[q + 1];
		visited = new boolean[q * q];

		for (int c = 0; c < q; c++) {
			adjZombie[c] = new ArrayList<Integer>();
		}
		
		for (int a0 = 0; a0 < q; a0++) {
			for (int i = 0; i < q; i++) {
				adjZombie[a0].add(in.nextInt());
			}
		}
		
		for(int i = 0; i < q; i++) {
			for(int j = 0; j < adjZombie[i].size(); j++) {
				System.out.print(adjZombie[i].get(j));
			}
			System.out.println();
		}
	}
}

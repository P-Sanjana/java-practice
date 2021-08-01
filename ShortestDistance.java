package Day1;

/*
 * 
 * 
 * 
Input: [[1,0,2,0,1],[0,0,0,0,0],[0,0,1,0,0]]

1 - 0 - 2 - 0 - 1
|   |   |   |   |
0 - 0 - 0 - 0 - 0
|   |   |   |   |
0 - 0 - 1 - 0 - 0

Output: 7 

Explanation: Given three buildings at (0,0), (0,4), (2,2), and an obstacle at (0,2),
             the point (1,2) is an ideal empty land to build a house, as the total 
             travel distance of 3+3+1=7 is minimal. So return 7.
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ShortestDistance {
	
	
	public static int shortestDistance(int[][] grid) {
		int[][] dist = new int[grid.length][grid[0].length];
		int walk = 1, minDist = -1;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				// if the current cell is a building time to find the adjacent
				// free space
				if (grid[i][j] == 1) {
				    // travesing to all 0 from first building, then to all -1 from second building and so on.
					minDist = bfs(dist, grid, --walk, i, j);
				}
			}
		}

		return minDist;
	}

    // Iterative BFS
	private static int bfs(int[][] dist, int[][] grid, int walk, int i, int j) {
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.offer(new int[] { i, j });

		int depth = 0, minDist = -1;
		int[][] delta = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

		while (!queue.isEmpty()) {
			depth++;
			int length = queue.size();
			
			// this loop is required so that same level depth cell can be visited
			for (int k = 0; k < length; k++) {
				int[] pos = queue.poll();
				for (int l = 0; l < 4; l++) {
					int y = pos[0] + delta[l][0];
					int x = pos[1] + delta[l][1];
                    
                    // if the adjacent cell is out of bound or unreachable
					if (y < 0 || y >= grid.length || x < 0 || x >= grid[y].length || grid[y][x]!=walk) {
						continue;
					}

					grid[y][x] = walk - 1;
					
					// calculates distance from each building to other building. 
					dist[y][x] += depth;

					queue.offer(new int[] { y, x });
                    
                    // This will always get the min val assigned. 
					if (minDist < 0 || minDist > dist[y][x]) {
						minDist = dist[y][x];
					}
				}
			}
		}
		
		return minDist;
	}

	
	public static void main(String args[] ) {
		 Scanner scan = new Scanner(System.in);
			int R=scan.nextInt();
			int C=scan.nextInt();      

			int[][] field=new int[R][C];
		       for(int i=0; i<R; i++)
		       {
		           for(int j=0; j<C; j++)
		           {
		        	   field[i][j] = scan.nextInt();
		           }
		       }
		       System.out.println(shortestDistance(field));
	}
}

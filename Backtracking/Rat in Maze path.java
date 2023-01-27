package Backtracking;

public class ratInMaze {
	
	public static boolean ratInMaze(int maze[][]) {
		
		int n = maze.length;
		int path[][] = new int[n][n];
		return solveMaze(maze, 0, 0, path);
	}
	
	public static boolean solveMaze(int maze[][], int i, int j, int path[][]) {
		
		int n = maze.length;
		//check if i, j cell is valid or not
		if(i < 0 || i>=n || j<0 || j>=n || maze[i][j] == 0 || path[i][j] == 1) {
			return false;
		}
		
		//include the cell in current path
		path[i][j] = 1;
		//Destination cell
		if(i == n-1 && j == n-1) {
			return true;
		}
		
		//Explore further in all directions
		//top direction
		if(solveMaze(maze, i-1, j, path)) {
			return true;
		}
		
		//right direction
		if(solveMaze(maze, i, j+1, path)) {
			return true;
		}
		
		//down direction 
		if(solveMaze(maze, i+1, j, path)) {
			return true;
		}
		
		//left direction
		if(solveMaze(maze, i, j-1, path)) {
			return true;
		}
		
		return false;

	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maze[][]= {{1,1,0},{1,1,0},{1,1,1}};
		boolean pathPossible = ratInMaze(maze);
		System.out.println(pathPossible);

	}

}

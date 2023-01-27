package Backtracking;

public class ratInMazePrintAllPaths {
	
public static void ratInMaze(int maze[][]) {
		
		int n = maze.length;
		int path[][] = new int[n][n];
		printAllPaths(maze, 0, 0, path);
	}
	
	public static void printAllPaths(int maze[][], int i, int j, int path[][]) {
		
		int n = maze.length;
		//check if i, j cell is valid or not
		if(i < 0 || i>=n || j<0 || j>=n || maze[i][j] == 0 || path[i][j] == 1) {
			return;
		}
		
		//include the cell in current path
		path[i][j] = 1;
		//Destination cell
		if(i == n-1 && j == n-1) {
			
			for(int row=0; row<n; row++) {
				
				for(int colm = 0; colm<n; colm++) {
					System.out.print(path[row][colm] +" ");
				}
				
				//System.out.println();
			}
			
			System.out.println();
			
			//reset destination cell path value to zero
			path[i][j]= 0;
			
			return;
		}
		
		//Explore further in all directions
		//top direction
		printAllPaths(maze, i-1, j, path);
		
		//right direction
		printAllPaths(maze, i, j+1, path);
		
		//down direction 
	    printAllPaths(maze, i+1, j, path);

		//left direction
	    printAllPaths(maze, i, j-1, path);
	    
	  //reset BackTrack path value to zero
	    path[i][j]= 0;
	
		return;	

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maze[][]= {{1,1,0},{1,1,0},{1,1,1}};
		ratInMaze(maze);
		
	}

}

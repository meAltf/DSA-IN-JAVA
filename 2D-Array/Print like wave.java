package Array2D;

public class printLikeWave {
	
public static void wavePrint(int mat[][]){
		
		int nRows = mat.length;
        
        if(nRows == 0) return;

        int mColm = mat[0].length;

        for(int j=0; j<mColm; j++){

            if(j%2 == 0){

                for(int i=0; i<nRows; i++){
                    System.out.print(mat[i][j] + " ");
                }
            }else{
                for(int i = nRows-1; i>=0; i--){
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
            
        
	}

}

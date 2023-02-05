package Array2D;

public class printSpiral {
	
	public static void spiralPrint(int matrix[][]){


		int nRows = matrix.length;
        if(nRows == 0) return;
        
        int mCols = matrix[0].length;
        int i, rowStart = 0, colStart = 0;

        int numElements = nRows*mCols;
        int count = 0;
        
        
        while(count < numElements){

            //1st part of spiral
            for( i = colStart; count< numElements && i< mCols; ++i){
                System.out.print(matrix[rowStart][i] + " ");
                count++;
            }
            rowStart++;

            //2nd part of spiral
            for(i = rowStart; count<numElements && i<nRows; ++i){
                System.out.print(matrix[i][mCols-1] + " ");
                count++;
            }
            mCols--;

            //3rd part of spiral
            for(i = mCols-1; count<numElements && i>= colStart; --i){
                System.out.print(matrix[nRows-1][i] + " ");
                count++;
            }
            nRows--;

            //4th and last part of spiral 
            for(i = nRows-1; count<numElements && i>= rowStart; --i){
                System.out.print(matrix[i][colStart] + " ");
                count++;
            }
            colStart++;
        }
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

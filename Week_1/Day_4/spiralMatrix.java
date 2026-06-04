class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int matRow = mat.length;
        int matCol = mat[0].length;
        int[][] reshapeMat = new int[r][c];
        int k=0;
        if((matRow*matCol)!=(r*c)){
            return mat;
        }
        else {
            for(int i=0 ; i<r ; i++){
                for(int j=0 ; j<c ; j++){
                    reshapeMat[i][j]=mat[k/matCol][k%matCol];
                    k++;
                }
            }
            return reshapeMat;
        }
    }
}

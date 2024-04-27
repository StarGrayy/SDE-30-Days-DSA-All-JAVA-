import java.util.Arrays;
class SetMatrix0 {
    public static void setZeroes(int[][] matrix) {
        int row0=1;
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                // zRow[0]=true;
                // zCol[0]=true;
                matrix[i][0]=0;
                if(j==0) row0=0;
                else matrix[0][j]=0;
                }
            }
        }
        for(int i=matrix.length-1;i>0;i--){
            for(int j =matrix[0].length-1;j>0;j--){
                if(matrix[i][j]!=0){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                  matrix[i][j]=0;
                }
            }
        }
        }
        if(matrix[0][0]==0){
            for(int j =0;j<matrix[0].length;j++) matrix[0][j]=0;
        }
        if(row0==0){
            for(int i =0;i<matrix.length;i++) matrix[i][0]=0;
        }
        
    }
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
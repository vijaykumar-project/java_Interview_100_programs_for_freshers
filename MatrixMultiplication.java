public class MatrixMultiplication {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{9,8,7},{6,5,4},{3,2,1}};
        int row=a.length,col1=a[0].length,col2=b[0].length;
        int res[][]=new int[row][col2];

        for(int i=0;i<row;i++){
            for(int j=0;j<col2;j++){
                for(int k=0;k<col1;k++){
                    res[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for (int colp[] : res) {
            for (int row1 : colp) {
                System.out.print(row1+" ");
            }
         System.out.println();}
    }
}

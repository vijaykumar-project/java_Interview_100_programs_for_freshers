
public class MatrixAddition {
    public static void main(String[] args) {
        int a[][]={{1,2,4},{3,4,5},{2,5,6}};
        int b[][]={{1,2,4},{3,4,5},{2,5,6}};
int row=a.length;
int col=a[0].length;
int res[][]=new int[row][col];
        for (int i=0;i<row;i++) {
             for (int j=0;j<col;j++) {
            res[i][j]=a[i][j]+b[i][j];
        }
    }
for (int col1[] : res) {
   for (int row1 : col1) {
       System.out.print(row1+" ");
   }
System.out.println();}
}}

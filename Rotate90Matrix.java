
import java.util.Arrays;

public class Rotate90Matrix {
public static void main(String[] args) {
    int a[][]={{1,2,3},{4,5,6},{7,8,9}};
int n=a.length;
// for(int i=0;i<n;i++){
//     for(int j=i+1;j<n;j++){
//         int temp=a[i][j];
//         a[i][j]=a[j][i];
//         a[j][i]=temp;
//     }
// }
for(int i=0;i<n;i++){
    for(int j=0,k=n-1;k>j;j++,k--){
        int temp=a[i][j];
        a[i][j]=a[i][k];
        a[i][k]=temp;
    }
}

for (int[] copy: a) {
System.out.println(Arrays.toString(copy));    
}
}}
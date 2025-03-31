
import java.util.Scanner;

public class HallowTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int n = sc.nextInt();
               for(int i=1;i<=n;i++){  //runs n times
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1 || i==n || j==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

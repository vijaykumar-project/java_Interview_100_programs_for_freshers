import java.util.*;
public class reverseHallowTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){  //1<3, 2<3
                System.out.print(" ");
            }
            for(int j=1;j<=2*(n-i+1)-1;j++){
                if(j==1 || i==1 || j == 2*(n-i+1)-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}    
